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
                request.getCharacterName(),
                request.getJobName(),
                request.getItemLevel()
        );

        LostArkCharacter savedCharacter = characterRepository.save(character);

        return new LostArkCharacterResponse(savedCharacter);
    }

    @Transactional(readOnly = true)
    public List<LostArkCharacterResponse> getCharacters() {
        return characterRepository.findAll()
                .stream()
                .map(LostArkCharacterResponse::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public LostArkCharacterResponse getCharacter(Long id) {
        LostArkCharacter character = characterRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("캐릭터를 찾을 수 없습니다. id=" + id));

        return new LostArkCharacterResponse(character);
    }

    @Transactional
    public LostArkCharacterResponse updateCharacter(Long id, LostArkCharacterUpdateRequest request) {
        LostArkCharacter character = characterRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("캐릭터를 찾을 수 없습니다. id=" + id));

        character.update(
                request.getCharacterName(),
                request.getJobName(),
                request.getItemLevel()
        );

        return new LostArkCharacterResponse(character);
    }

    @Transactional
    public void deleteCharacter(Long id) {
        LostArkCharacter character = characterRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("캐릭터를 찾을 수 없습니다. id=" + id));

        characterRepository.delete(character);
    }
}