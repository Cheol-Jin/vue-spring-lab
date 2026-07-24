package com.example.vuespringlabbackend.lostark.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Getter
@NoArgsConstructor
public class LostArkCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String characterName;

    private String jobName;

    private Integer itemLevel;

    public LostArkCharacter(String characterName, String jobName, Integer itemLevel) {
        this.characterName = characterName;
        this.jobName = jobName;
        this.itemLevel = itemLevel;
    }

    public void update(String characterName, String jobName, Integer itemLevel) {
        this.characterName = characterName;
        this.jobName = jobName;
        this.itemLevel = itemLevel;
    }

    public static interface LostArkCharacterRepository extends JpaRepository<LostArkCharacter, Long> {
    }
}