package com.ifacebox.speech.ws;

import com.ifacebox.speech.AudioSpeechConfig;
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

}
