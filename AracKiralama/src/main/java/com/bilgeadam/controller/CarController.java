package com.bilgeadam.controller;

import com.bilgeadam.dto.request.SaveCarRequestDto;
import com.bilgeadam.repository.entity.Car;
import com.bilgeadam.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bilgeadam.constants.EndPointList.*;

@RestController
@RequestMapping(CAR)
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

   /* @PostMapping(SAVE)
    public ResponseEntity<Car> saveKitap(@RequestBody @Valid SaveCarRequestDto dto) {
        return ResponseEntity.ok(carService.save(dto));
    }*/

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Car>> findAll() {
        List<Car> result = carService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/find-by-name")
    public ResponseEntity<List<Car>> findAllByNameStartingWithIgnoreCase(String name){
        return ResponseEntity.ok(carService.findAllByNameStartingWithIgnoreCase(name));
    }

    @GetMapping("/find-by-brand")
    public ResponseEntity<List<Car>> findAllByBrandid(Long id){
        return ResponseEntity.ok(carService.findAllByBrandid(id));
    }

    @GetMapping("/find-color-brand")
    public ResponseEntity<List<Car>> findCarsWithColorAndBrand(){
        return ResponseEntity.ok(carService.findCarsWithColorAndBrand());
    }

    @GetMapping("/find-daily-price")
    public ResponseEntity<List<Car>> findAllByDailyPriceLessThanEqual(int dailyPrice){
        return ResponseEntity.ok(carService.findAllByDailyPriceLessThanEqual(dailyPrice));
    }
}