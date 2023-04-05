package com.bilgeadam.repository;

import com.bilgeadam.dto.response.FindAllCarRentPriceDto;
import com.bilgeadam.repository.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository extends JpaRepository<Car, Integer> {
    List<Car> findAllByDailyPriceLessThanEqual(int dailyPrice);

    List<Car> findAllByCarNameStartingWithIgnoreCase(String carName);

    List<Car> findAllByBrandId(int id);

    List<Car> findAllByColorId(int colorId);
    @Query(value = "select c.car_name,c.daily_price from tblcar as c where c.rent_id > 0;", nativeQuery = true)
    List<FindAllCarRentPriceDto> findAllCarRentPrice();



}
