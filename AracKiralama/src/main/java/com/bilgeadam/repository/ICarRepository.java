package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository extends JpaRepository<Car, Integer> {
    List<Car> findAllByDailyPriceLessThanEqual(int dailyPrice);

    List<Car> findAllByCarNameStartingWithIgnoreCase(String carName);

    List<Car> findAllByBrandId(int id);

    List<Car> findAllByColorId(int colorId);



}
