package com.example.vuespringlabbackend.lostark.Dto;

public record LostArkCharacterCreateRequest(
        String characterName,
        String jobName,
        Integer itemLevel
) {
}
