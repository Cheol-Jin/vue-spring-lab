package com.example.vuespringlabbackend.lostark.Service;

import com.example.vuespringlabbackend.lostark.Dto.LostArkCharacterCreateRequest;
import com.example.vuespringlabbackend.lostark.Dto.LostArkCharacterResponse;
import com.example.vuespringlabbackend.lostark.Dto.LostArkCharacterUpdateRequest;
import com.example.vuespringlabbackend.lostark.Entity.LostArkCharacter;
import com.example.vuespringlabbackend.lostark.Repository.LostArkCharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LostArkCharacterService {

    private final LostArkCharacterRepository characterRepository;

    @Transactional
    public LostArkCharacterResponse createCharacter(LostArkCharacterCreateRequest request) {
        LostArkCharacter character = new LostArkCharacter(
                request.characterName(),
                request.jobName(),
                request.itemLevel()
        );

        LostArkCharacter savedCharacter = characterRepository.save(character);

        return LostArkCharacterResponse.from(savedCharacter);
    }

    @Transactional(readOnly = true)
    public List<LostArkCharacterResponse> getCharacters() {
        return characterRepository.findAll()
                .stream()
                .map(LostArkCharacterResponse::from)
                .toList();
    }

    @Transactional(readOnly = true)
    public LostArkCharacterResponse getCharacter(Long id) {
        LostArkCharacter character = characterRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("캐릭터를 찾을 수 없습니다. id=" + id));

        return LostArkCharacterResponse.from(character);
    }

    @Transactional
    public LostArkCharacterResponse updateCharacter(Long id, LostArkCharacterUpdateRequest request) {
        LostArkCharacter character = characterRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("캐릭터를 찾을 수 없습니다. id=" + id));

        character.update(
                request.characterName(),
                request.jobName(),
                request.itemLevel()
        );

        return LostArkCharacterResponse.from(character);
    }

    @Transactional
    public void deleteCharacter(Long id) {
        LostArkCharacter character = characterRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("캐릭터를 찾을 수 없습니다. id=" + id));

        characterRepository.delete(character);
    }
}