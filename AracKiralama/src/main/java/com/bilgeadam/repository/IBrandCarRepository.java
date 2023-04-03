package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.BrandCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBrandCarRepository extends JpaRepository<BrandCar, Integer> {
}
