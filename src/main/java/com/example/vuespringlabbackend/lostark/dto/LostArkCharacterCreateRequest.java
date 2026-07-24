package com.example.vuespringlabbackend.lostark.dto;

public record LostArkCharacterCreateRequest(
        String characterName,
        String jobName,
        Integer itemLevel
) {
}
