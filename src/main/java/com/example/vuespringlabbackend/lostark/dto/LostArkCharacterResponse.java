package com.example.vuespringlabbackend.lostark.dto;

import com.example.vuespringlabbackend.lostark.entity.LostArkCharacter;

public record LostArkCharacterResponse(
        Long id,
        String characterName,
        String jobName,
        Integer itemLevel
) {

    public static LostArkCharacterResponse from(LostArkCharacter character) {
        return new LostArkCharacterResponse(
                character.getId(),
                character.getCharacterName(),
                character.getJobName(),
                character.getItemLevel()
        );
    }
}
