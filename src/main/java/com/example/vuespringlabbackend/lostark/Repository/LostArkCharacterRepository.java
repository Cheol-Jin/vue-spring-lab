package com.example.vuespringlabbackend.lostark.Repository;

import com.example.vuespringlabbackend.lostark.Entity.LostArkCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LostArkCharacterRepository extends JpaRepository<LostArkCharacter, Long> {
}
