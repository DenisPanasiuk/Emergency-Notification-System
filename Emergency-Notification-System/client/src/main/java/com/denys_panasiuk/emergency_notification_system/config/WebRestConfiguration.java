package com.denys_panasiuk.emergency_notification_system.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebRestConfiguration {

    @Value(value = "${backend.rest.url}")
    private String backEndRestUrl;

    @Bean
    public WebClient webClient() {
        return WebClient
                .builder()
                .baseUrl(backEndRestUrl)
                .build();
    }
}
