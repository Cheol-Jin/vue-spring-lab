package com.example.vuespringlabbackend.lostark.Dto;

public record LostArkCharacterUpdateRequest(
        String characterName,
        String jobName,
        Integer itemLevel
) {
}
