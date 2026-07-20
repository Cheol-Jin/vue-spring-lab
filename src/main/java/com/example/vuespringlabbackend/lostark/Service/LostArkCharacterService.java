package com.example.vuespringlabbackend.lostark.Service;

import com.example.vuespringlabbackend.lostark.Dto.LostArkCharacterCreateRequest;
import com.example.vuespringlabbackend.lostark.Dto.LostArkCharacterResponse;
import com.example.vuespringlabbackend.lostark.Entity.LostArkCharacter;
import com.example.vuespringlabbackend.lostark.Repository.LostArkCharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LostArkCharacterService {

    private final LostArkCharacterRepository characterRepository;

    public LostArkCharacterResponse createCharacter(LostArkCharacterCreateRequest request) {
        LostArkCharacter character = new LostArkCharacter(
                request.getCharacterName(),
                request.getJobName(),
                request.getItemLevel()
        );

        LostArkCharacter savedCharacter = characterRepository.save(character);

        return new LostArkCharacterResponse(savedCharacter);
    }

    public List<LostArkCharacterResponse> getCharacters() {
        return characterRepository.findAll()
                .stream()
                .map(LostArkCharacterResponse::new)
                .toList();
    }
}