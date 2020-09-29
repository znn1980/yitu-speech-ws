package com.ifacebox.speech;

import com.google.protobuf.ByteString;
import com.yitutech.speech.*;
import com.yitutech.speech.SpeechRecognitionGrpc.SpeechRecognitionStub;
import io.grpc.*;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author znn
 */
public class AudioSpeechServer implements StreamObserver<StreamingSpeechResponse> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AudioSpeechServer.class);
    private ManagedChannel managedChannel;
    private SpeechRecognitionStub speechRecognitionStub;
    private StreamObserver<StreamingSpeechRequest> streamObserverRequest;
    private AudioDataCallback audioDataCallback;
    private AudioSpeechConfig audioSpeechConfig;

    public AudioSpeechServer(AudioSpeechConfig audioSpeechConfig, AudioDataCallback audioDataCallback) {
        this.audioSpeechConfig = audioSpeechConfig;
        this.audioDataCallback = audioDataCallback;
    }

    public void start() {
        LOGGER.info("依图实时语音转写服务启动中...");
        managedChannel = ManagedChannelBuilder.forAddress(audioSpeechConfig.getIp(), audioSpeechConfig.getPort()).usePlaintext().build();
        speechRecognitionStub = SpeechRecognitionGrpc.newStub(ClientInterceptors.intercept(managedChannel, new SpeechClientInterceptor(audioSpeechConfig)));
        streamObserverRequest = speechRecognitionStub.recognizeStream(this);
        streamObserverRequest.onNext(StreamingSpeechRequest.newBuilder().setStreamingSpeechConfig(this.getStreamingSpeechConfig()).build());
        LOGGER.info("依图实时语音转写服务启动完成");
    }

    public void stop() {
        LOGGER.info("依图实时语音转写服务停止中...");
        managedChannel.shutdown();
        LOGGER.info("依图实时语音转写服务停止完成");
    }

    @Override
    public void onNext(StreamingSpeechResponse response) {
        StreamingSpeechStatus status = response.getStatus();
        LOGGER.info("当前音频处理进行到的时间点（音频开始时间为0）：" + status.getProcessedTimestamp());
        StreamingSpeechResult result = response.getResult();
        LOGGER.info("此识别结果是否为最终结果：" + result.getIsFinal());
        StreamingTranscription transcription = result.getBestTranscription();
        LOGGER.info("转写结果：" + transcription.getTranscribedText());
        if (!transcription.getTranscribedText().isEmpty()) {
            audioDataCallback.onText(result.getIsFinal(), transcription.getTranscribedText());
        }
    }

    @Override
    public void onError(Throwable t) {
        LOGGER.error("异常：" + t);
        audioDataCallback.onError(t);
    }

    @Override
    public void onCompleted() {
        LOGGER.info("完成：");
    }

    public void setAudioData(byte[] bytes) {
        this.setAudioData(bytes, 0, bytes.length);
    }

    public void setAudioData(byte[] bytes, int offset, int size) {
        streamObserverRequest.onNext(StreamingSpeechRequest.newBuilder().setAudioData(ByteString.copyFrom(bytes, offset, size)).build());
    }

    public StreamingSpeechConfig getStreamingSpeechConfig() {
        SpeechConfig.Builder speechConfig = SpeechConfig.newBuilder();
        speechConfig.setLang(SpeechConfig.Language.MANDARIN);
        speechConfig.setScene(SpeechConfig.Scene.GENERALSCENE);
        speechConfig.setRecognizeType(SpeechConfig.RecognizeType.ALL);
        AudioConfig.Builder audioConfig = AudioConfig.newBuilder();
        audioConfig.setAue(AudioConfig.AudioEncoding.PCM);
        audioConfig.setSampleRate(audioSpeechConfig.getSampleRate());
        StreamingSpeechConfig.Builder streamingSpeechConfig = StreamingSpeechConfig.newBuilder();
        streamingSpeechConfig.setSpeechConfig(speechConfig.build());
        streamingSpeechConfig.setAudioConfig(audioConfig.build());
        return streamingSpeechConfig.build();
    }
}
