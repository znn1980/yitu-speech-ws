package com.ifacebox.speech.ws;

import com.ifacebox.speech.AudioSpeechConfig;
import com.ifacebox.speech.AudioSpeechServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author znn
 */
@Configuration
public class WebSocketConfigurer {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Bean
    public AudioSpeechConfig audioSpeechConfig() {
        return new AudioSpeechConfig();
    }

    @Bean
    public AudioSpeechServer AudioSpeechServer() {
        AudioSpeechServer audioSpeechServer = new AudioSpeechServer();
        audioSpeechServer.setAudioSpeechConfig(audioSpeechConfig());
        return audioSpeechServer;
    }

}
