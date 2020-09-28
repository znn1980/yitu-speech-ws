package com.ifacebox.speech.ws;

import com.ifacebox.speech.AudioDataCallback;
import com.ifacebox.speech.AudioSpeechConfig;
import com.ifacebox.speech.AudioSpeechServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * @author znn
 */
@ServerEndpoint("/yitu/speech")
@Component
public class WebSocketServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketServer.class);
    private static AudioSpeechConfig audioSpeechConfig;
    private AudioSpeechServer audioSpeechServer;

    @Autowired
    public void setAudioSpeechConfig(AudioSpeechConfig audioSpeechConfig) {
        WebSocketServer.audioSpeechConfig = audioSpeechConfig;
    }

    @OnOpen
    public void onOpen(Session session) {
        LOGGER.info("打开语音通道：" + session.getId());
        audioSpeechServer = new AudioSpeechServer(audioSpeechConfig, new AudioDataCallback() {
            @Override
            public void onText(boolean isFinal, String text) {
                session.getAsyncRemote().sendText("{\"final\":" + isFinal + ",\"text\":\"" + text + "\"}");
            }

            @Override
            public void onError(Throwable t) {
                session.getAsyncRemote().sendText("{\"text\":\"" + t.getMessage() + "\"}");
                try {
                    session.close();
                } catch (IOException e) {
                }
            }
        });
        audioSpeechServer.start();
    }

    @OnClose
    public void onClose(Session session) {
        LOGGER.info("关闭语音通道：" + session.getId());
        if (audioSpeechServer != null) {
            audioSpeechServer.stop();
            audioSpeechServer = null;
        }
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        LOGGER.error("关闭语音通道：" + session.getId(), throwable);
        if (audioSpeechServer != null) {
            audioSpeechServer.stop();
            audioSpeechServer = null;
        }
    }

    @OnMessage
    public void onMessage(Session session, byte[] message) {
        if (audioSpeechServer != null) {
            audioSpeechServer.setAudioData(message, 0, message.length);
        }
    }

}
