package com.example.vuespringlabbackend.lostark.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record LostArkProfileResponse(

        @JsonProperty("CharacterImage")
        String characterImage,

        @JsonProperty("ExpeditionLevel")
        Integer expeditionLevel,

        @JsonProperty("PvpGradeName")
        String pvpGradeName,

        @JsonProperty("TownLevel")
        Integer townLevel,

        @JsonProperty("TownName")
        String townName,

        @JsonProperty("Title")
        String title,

        @JsonProperty("GuildMemberGrade")
        String guildMemberGrade,

        @JsonProperty("GuildName")
        String guildName,

        @JsonProperty("UsingSkillPoint")
        Integer usingSkillPoint,

        @JsonProperty("TotalSkillPoint")
        Integer totalSkillPoint,

        @JsonProperty("Stats")
        Object stats,

        @JsonProperty("Tendencies")
        Object tendencies,

        @JsonProperty("ServerName")
        String serverName,

        @JsonProperty("CharacterName")
        String characterName,

        @JsonProperty("CharacterLevel")
        Integer characterLevel,

        @JsonProperty("CharacterClassName")
        String characterClassName,

        @JsonProperty("ItemAvgLevel")
        String itemAvgLevel,

        @JsonProperty("ItemMaxLevel")
        String itemMaxLevel
) {
}
