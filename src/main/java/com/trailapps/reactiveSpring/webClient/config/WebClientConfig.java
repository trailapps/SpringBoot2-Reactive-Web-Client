package com.trailapps.reactiveSpring.webClient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    WebClient webClientConfig() {
        return WebClient.create("http://localhost:8080/users");
    }
}
