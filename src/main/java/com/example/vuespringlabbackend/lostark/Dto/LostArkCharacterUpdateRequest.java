package com.example.vuespringlabbackend.lostark.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LostArkCharacterUpdateRequest {

    private String characterName;
    private String jobName;
    private Integer itemLevel;
}
