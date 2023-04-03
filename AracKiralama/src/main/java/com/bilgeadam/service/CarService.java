package com.bilgeadam.service;


import com.bilgeadam.repository.ICarRepository;
import com.bilgeadam.repository.entity.Car;
import com.bilgeadam.utility.ServiceManager;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService extends ServiceManager<Car,Integer> {
    private final ICarRepository repository;

    private final BrandCarService brandCarServiceService;

    private final ColorCarService colorCarService;

    public CarService(ICarRepository repository,BrandCarService brandCarServiceService,ColorCarService colorCarService) {
        super(repository);
        this.repository = repository;
        this.brandCarServiceService = brandCarServiceService;
        this.colorCarService = colorCarService;
    }

    public List<Car> findAllByDailyPriceLessThanEqual(int dailyPrice){
        return repository.findAllByDailyPriceLessThanEqual(dailyPrice);
    }

    public List<Car> findAllByNameStartingWithIgnoreCase(String name) {
        return repository.findAllByNameStartingWithIgnoreCase(name);
    }

    public List<Car> findCarsWithColorAndBrand(){
        return repository.findCarsWithColorAndBrand();

    }

    public List<Car> findAllByBrandid(Long id) {
        return repository.findAllByBrandid(id);
    }




}
