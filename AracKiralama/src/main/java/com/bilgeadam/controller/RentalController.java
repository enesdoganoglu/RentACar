package com.bilgeadam.controller;

import com.bilgeadam.dto.request.SaveRentalRequestDto;
import com.bilgeadam.repository.entity.Rental;
import com.bilgeadam.service.RentalService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.bilgeadam.constants.EndPointList.FIND_ALL;
import static com.bilgeadam.constants.EndPointList.RENTAL;


@RestController
@RequestMapping(RENTAL)
@RequiredArgsConstructor
public class RentalController {

    private final RentalService rentalService;
    @PostMapping(SAVE)
    public ResponseEntity<Rental> saveRental(@RequestBody @Valid SaveRentalRequestDto dto){
        return ResponseEntity.ok(rentalService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Rental>> findAll(){
        List<Rental> result=rentalService.findAll();
        return ResponseEntity.ok(result);
    }
}
