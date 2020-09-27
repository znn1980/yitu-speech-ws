package com.ifacebox.speech;

import com.yitutech.speech.StreamingSpeechResponse;
import com.yitutech.speech.StreamingSpeechResult;
import com.yitutech.speech.StreamingSpeechStatus;
import com.yitutech.speech.StreamingTranscription;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author znn
 */
public class SpeechStreamObserver implements StreamObserver<StreamingSpeechResponse> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpeechStreamObserver.class);
    private AudioDataCallback audioDataCallback;
    private RecognizeStreamCallback recognizeStreamCallback;

    public SpeechStreamObserver(AudioDataCallback audioDataCallback, RecognizeStreamCallback recognizeStreamCallback) {
        this.audioDataCallback = audioDataCallback;
        this.recognizeStreamCallback = recognizeStreamCallback;
    }


    @Override
    public void onNext(StreamingSpeechResponse response) {
        StreamingSpeechStatus status = response.getStatus();
        LOGGER.info("当前音频处理进行到的时间点（音频开始时间为0）：" + status.getProcessedTimestamp());
        StreamingSpeechResult result = response.getResult();
        LOGGER.info("此识别结果是否为最终结果：" + result.getIsFinal());
        StreamingTranscription transcription = result.getBestTranscription();
        LOGGER.info("转写结果：" + transcription.getTranscribedText());
        if (audioDataCallback != null && !transcription.getTranscribedText().isEmpty()) {
            audioDataCallback.setText(result.getIsFinal(), transcription.getTranscribedText());
        }
    }

    @Override
    public void onError(Throwable t) {
        LOGGER.error("异常：" + t);
        recognizeStreamCallback.reboot();
    }

    @Override
    public void onCompleted() {
        LOGGER.info("完成：");
    }
}
