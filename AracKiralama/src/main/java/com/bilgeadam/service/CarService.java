package com.bilgeadam.service;


import com.bilgeadam.exception.AracKiralamaException;
import com.bilgeadam.exception.ErrorType;
import com.bilgeadam.repository.ICarRepository;
import com.bilgeadam.repository.entity.Car;
import com.bilgeadam.utility.ServiceManager;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService extends ServiceManager<Car,Integer> {
    private final ICarRepository repository;



    public CarService(ICarRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<Car> findAllByDailyPriceLessThanEqual(int dailyPrice){
        return repository.findAllByDailyPriceLessThanEqual(dailyPrice);
    }

    public List<Car> findAllByCarNameStartingWithIgnoreCase(String name) {
        List<Car> car = repository.findAllByCarNameStartingWithIgnoreCase(name);

        return car;
    }

    public List<Car> findAllByBrandid(int id) {
        List<Car> car = repository.findAllByBrandId(id);
        if (car.isEmpty()) {
            throw new AracKiralamaException(ErrorType.CAR_NOT_FOUND);
        }
        return car;
    }

    public List<Car> findAllByColorid(int colorId) {
        List<Car> car = repository.findAllByColorId(colorId);
        if (car.isEmpty()) {
            throw new AracKiralamaException(ErrorType.CAR_NOT_FOUND);
        }
        return car;
    }




}
