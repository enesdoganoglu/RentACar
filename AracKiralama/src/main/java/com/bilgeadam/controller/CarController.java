package com.bilgeadam.controller;



import com.bilgeadam.dto.response.FindAllCarRentPriceDto;
import com.bilgeadam.repository.entity.Car;
import com.bilgeadam.service.CarService;
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

    @PostMapping(SAVE)
    public ResponseEntity<Car> saveCar(@RequestBody Car dto) {
        return ResponseEntity.ok(carService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Car>> findAll() {
        List<Car> result = carService.findAll();
        return ResponseEntity.ok(result);
    }



    @GetMapping(FIND_DAILY_PRICE)
    public ResponseEntity<List<Car>> findAllByDailyPriceLessThanEqual(int dailyPrice){
        return ResponseEntity.ok(carService.findAllByDailyPriceLessThanEqual(dailyPrice));
    }

    @GetMapping(FIND_BY_NAME)
    public ResponseEntity<List<Car>> findAllByCarNameStartingWithIgnoreCase(String name){
        return ResponseEntity.ok(carService.findAllByCarNameStartingWithIgnoreCase(name));
    }


    @GetMapping(FIND_BY_BRAND)
    public ResponseEntity<List<Car>> findAllByBrandId(int id){
        return ResponseEntity.ok(carService.findAllByBrandid(id));
    }

    @GetMapping(FIND_BY_COLOR)
    public ResponseEntity<List<Car>> findAllByColorId(int colorId){
        return ResponseEntity.ok(carService.findAllByColorid(colorId));
    }

    @GetMapping("/find-car-rent")
    public ResponseEntity<List<FindAllCarRentPriceDto>> findAllCarRentPrice(){
        return ResponseEntity.ok(carService.findAllCarRentPrice());
    }




}