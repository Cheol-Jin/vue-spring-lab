package com.example.vuespringlabbackend.lostark.Controller;

import com.example.vuespringlabbackend.lostark.Dto.LostArkCharacterCreateRequest;
import com.example.vuespringlabbackend.lostark.Dto.LostArkCharacterResponse;
import com.example.vuespringlabbackend.lostark.Service.LostArkCharacterService;
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
}