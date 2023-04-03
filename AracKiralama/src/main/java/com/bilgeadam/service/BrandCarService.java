package com.bilgeadam.service;

import com.bilgeadam.repository.IBrandCarRepository;
import com.bilgeadam.repository.entity.BrandCar;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class BrandCarService extends ServiceManager<BrandCar,Integer> {
    private final IBrandCarRepository repository;
    public BrandCarService(IBrandCarRepository repository) {
        super(repository);
        this.repository = repository;
    }
        public void save(Integer brandid,Integer carid){
            save(BrandCar.builder()
                    .brandid(brandid)
                    .carid(carid)
                    .build());
        }


    }

