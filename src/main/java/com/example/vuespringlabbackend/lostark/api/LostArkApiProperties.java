package com.example.vuespringlabbackend.lostark.api;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "lostark.api")
public record LostArkApiProperties(
        String baseUrl,
        String key
) {
}
