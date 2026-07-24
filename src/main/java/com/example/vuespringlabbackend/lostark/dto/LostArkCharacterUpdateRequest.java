package com.example.vuespringlabbackend.lostark.dto;

public record LostArkCharacterUpdateRequest(
        String characterName,
        String jobName,
        Integer itemLevel
) {
}
