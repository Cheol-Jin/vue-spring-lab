package com.example.vuespringlabbackend.lostark.controller;

import com.example.vuespringlabbackend.lostark.dto.LostArkCharacterCreateRequest;
import com.example.vuespringlabbackend.lostark.dto.LostArkCharacterResponse;
import com.example.vuespringlabbackend.lostark.dto.LostArkCharacterUpdateRequest;
import com.example.vuespringlabbackend.lostark.service.LostArkCharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/lostark")
public class LostArkController {

    private final LostArkCharacterService characterService;

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of(
                "game", "Lost Ark",
                "serverStatus", "OK",
                "message", "로스트아크 프로젝트 API가 정상적으로 실행 중입니다."
        );
    }

    @PostMapping("/characters")
    public LostArkCharacterResponse createCharacter(@RequestBody LostArkCharacterCreateRequest request) {
        return characterService.createCharacter(request);
    }

    @GetMapping("/characters")
    public List<LostArkCharacterResponse> getCharacters() {
        return characterService.getCharacters();
    }

    @GetMapping("/characters/{id}")
    public LostArkCharacterResponse getCharacter(@PathVariable Long id) {
        return characterService.getCharacter(id);
    }

    @PutMapping("/characters/{id}")
    public LostArkCharacterResponse updateCharacter(
            @PathVariable Long id,
            @RequestBody LostArkCharacterUpdateRequest request
    ) {
        return characterService.updateCharacter(id, request);
    }

    @DeleteMapping("/characters/{id}")
    public void deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
    }
}