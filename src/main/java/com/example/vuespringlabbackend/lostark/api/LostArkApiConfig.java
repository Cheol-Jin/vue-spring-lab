package com.example.vuespringlabbackend.lostark.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class LostArkApiConfig {

    @Bean
    public RestClient lostArkRestClient(LostArkApiProperties properties) {
        return RestClient.builder()
                .baseUrl(properties.baseUrl())
                .defaultHeader("accept", "application/json")
                .defaultHeader("authorization", "bearer " + properties.key())
                .build();
    }
}
