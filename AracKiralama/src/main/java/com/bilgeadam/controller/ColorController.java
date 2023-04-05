package com.bilgeadam.controller;

import com.bilgeadam.dto.request.SaveColorRequestDto;
import com.bilgeadam.repository.entity.Color;
import com.bilgeadam.service.ColorService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bilgeadam.constants.EndPointList.*;

@RestController
@RequestMapping(COLOR)
@RequiredArgsConstructor
public class ColorController {
    private final ColorService colorService;
    @PostMapping(SAVE)
    public ResponseEntity<Color> saveColor(@RequestBody @Valid SaveColorRequestDto dto){
        return ResponseEntity.ok(colorService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Color>> findAll(){
        List<Color> result=colorService.findAll();
        return ResponseEntity.ok(result);
    }
}
