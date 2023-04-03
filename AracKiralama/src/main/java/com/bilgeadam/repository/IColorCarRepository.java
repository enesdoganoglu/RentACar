package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.ColorCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IColorCarRepository extends JpaRepository<ColorCar, Integer> {
}
