package com.example.vuespringlabbackend.lostark.Dto;

import com.example.vuespringlabbackend.lostark.Entity.LostArkCharacter;
import lombok.Getter;

@Getter
public class LostArkCharacterResponse {

    private final Long id;
    private final String characterName;
    private final String jobName;
    private final Integer itemLevel;

    public LostArkCharacterResponse(LostArkCharacter character) {
        this.id = character.getId();
        this.characterName = character.getCharacterName();
        this.jobName = character.getJobName();
        this.itemLevel = character.getItemLevel();
    }
}
