package com.example.vuespringlabbackend.lostark.repository;

import com.example.vuespringlabbackend.lostark.entity.LostArkCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LostArkCharacterRepository extends JpaRepository<LostArkCharacter, Long> {
}
