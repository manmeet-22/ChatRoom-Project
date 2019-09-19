package edu.udacity.java.nano.chat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * The Class WebSocketConfig.
 *
 * @author Manmeet Singh
 */
@Configuration
public class WebSocketConfig {

    /**
     * Server endpoint exporter.
     *
     * @return the server endpoint exporter
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
