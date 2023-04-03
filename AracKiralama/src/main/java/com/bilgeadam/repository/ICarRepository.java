package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository extends JpaRepository<Car, Integer> {
    List<Car> findAllByDailyPriceLessThanEqual(int dailyPrice);


    List<Car> findCarsWithColorAndBrand();

    List<Car> findAllByNameStartingWithIgnoreCase(String name);

    List<Car> findAllByBrandid(Long id);
}
