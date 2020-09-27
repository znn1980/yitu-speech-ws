package com.ifacebox.speech.ws;

import com.ifacebox.speech.AudioDataCallback;
import com.ifacebox.speech.AudioSpeechServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author znn
 */
@ServerEndpoint("/yitu/speech")
@Component
public class WebSocketServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketServer.class);
    private static final Map<String, Session> USER_SESSION_POOLS = new ConcurrentHashMap<>();
    private static AudioSpeechServer audioSpeechServer;

    @Autowired
    public void setAudioSpeechServer(AudioSpeechServer audioSpeechServer) {
        WebSocketServer.audioSpeechServer = audioSpeechServer;
        WebSocketServer.audioSpeechServer.setAudioDataCallback(new AudioDataCallback() {
            @Override
            public void setText(boolean isFinal, String text) {
                sendMessage(isFinal, text);
            }
        });
        WebSocketServer.audioSpeechServer.start();
    }

    @OnOpen
    public void onOpen(Session session) {
        USER_SESSION_POOLS.put(session.getId(), session);
        LOGGER.info("进入：" + session.getId());
    }

    @OnClose
    public void onClose(Session session) {
        USER_SESSION_POOLS.remove(session.getId());
        LOGGER.info("退出：" + session.getId());
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        USER_SESSION_POOLS.remove(session.getId());
        LOGGER.error("异常：" + session.getId(), throwable);
    }

    @OnMessage
    public void onMessage(byte[] message, Session session) {
        //LOGGER.info("数据：" + session.getId() + "【" + message.length + "】");
        audioSpeechServer.setAudioData(message, 0, message.length);
    }

    public void sendMessage(boolean isFinal, String text) {
        for (Session session : USER_SESSION_POOLS.values()) {
            session.getAsyncRemote().sendText("{\"final\":" + isFinal + ",\"text\":\"" + text + "\"}");
        }
    }
}
