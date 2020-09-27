package com.ifacebox.speech;

import com.google.protobuf.ByteString;
import com.yitutech.speech.*;
import com.yitutech.speech.SpeechRecognitionGrpc.SpeechRecognitionStub;
import io.grpc.*;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author znn
 */
public class AudioSpeechServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(AudioSpeechServer.class);
    private static final int REBOOT_TIME = 1000 * 5;
    private ManagedChannel channel;
    private SpeechRecognitionStub stub;
    private StreamObserver<StreamingSpeechRequest> requestObserver;
    private AudioDataCallback callback;
    private AudioSpeechConfig config;
    private Timer timer;

    public AudioSpeechServer(AudioSpeechConfig config) {
        this.config = config;
    }

    public void setAudioDataCallback(AudioDataCallback callback) {
        this.callback = callback;
    }

    public void start() {
        LOGGER.info("依图实时语音转写服务启动中...");
        channel = ManagedChannelBuilder.forAddress(config.getIp(), config.getPort()).usePlaintext().build();
        this.start(false);
        LOGGER.info("依图实时语音转写服务启动完成");
    }

    public void start(boolean isReboot) {
        stub = SpeechRecognitionGrpc.newStub(ClientInterceptors.intercept(channel, new SpeechClientInterceptor(config)));
        requestObserver = stub.recognizeStream(new SpeechStreamObserver(callback, new RecognizeStreamCallback() {
            @Override
            public void reboot() {
                timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        start(true);
                        timer.cancel();
                        timer = null;
                    }
                }, isReboot ? REBOOT_TIME : 0);
            }
        }));
        requestObserver.onNext(StreamingSpeechRequest.newBuilder().setStreamingSpeechConfig(getConfig()).build());
    }

    public void stop() {
        LOGGER.info("依图实时语音转写服务停止中...");
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        channel.shutdown();
        LOGGER.info("依图实时语音转写服务停止完成");
    }

    public void setAudioData(byte[] bytes, int offset, int size) {
        requestObserver.onNext(StreamingSpeechRequest.newBuilder().setAudioData(ByteString.copyFrom(bytes, offset, size)).build());
    }

    public void setAudioData(InputStream is) throws IOException {
        requestObserver.onNext(StreamingSpeechRequest.newBuilder().setAudioData(ByteString.readFrom(is)).build());
    }

    public StreamingSpeechConfig getConfig() {
        SpeechConfig.Builder speechConfig = SpeechConfig.newBuilder();
        speechConfig.setLang(SpeechConfig.Language.MANDARIN);
        speechConfig.setScene(SpeechConfig.Scene.GENERALSCENE);
        speechConfig.setRecognizeType(SpeechConfig.RecognizeType.ALL);
        AudioConfig.Builder audioConfig = AudioConfig.newBuilder();
        audioConfig.setAue(AudioConfig.AudioEncoding.PCM);
        audioConfig.setSampleRate(config.getSampleRate());
        StreamingSpeechConfig.Builder streamingSpeechConfig = StreamingSpeechConfig.newBuilder();
        streamingSpeechConfig.setSpeechConfig(speechConfig.build());
        streamingSpeechConfig.setAudioConfig(audioConfig.build());
        return streamingSpeechConfig.build();
    }
}
