package com.example.vuespringlabbackend;

import com.example.vuespringlabbackend.lostark.api.LostArkApiProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(LostArkApiProperties.class)
public class VueSpringLabBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueSpringLabBackendApplication.class, args);
    }
}
