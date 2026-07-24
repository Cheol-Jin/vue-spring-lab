package com.example.vuespringlabbackend.lostark.api;

import com.example.vuespringlabbackend.lostark.dto.LostArkProfileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class LostArkOpenApiClient {

    private final RestClient lostArkRestClient;

    public LostArkProfileResponse getCharacterProfile(String characterName) {
        return lostArkRestClient.get()
                .uri("/armories/characters/{characterName}/profiles", characterName)
                .retrieve()
                .body(LostArkProfileResponse.class);
    }
}
