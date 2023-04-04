package com.bilgeadam.service;

import com.bilgeadam.repository.IColorCarRepository;
import com.bilgeadam.repository.entity.ColorCar;
import com.bilgeadam.utility.ServiceManager;

public class ColorCarService extends ServiceManager<ColorCar,Integer> {

    private final IColorCarRepository repository;

    public ColorCarService(IColorCarRepository repository){
        super(repository);
        this.repository = repository;
    }

    public void save(Integer colorid,Integer carid){
        save(ColorCar.builder()
                .colorid(colorid)
                .carid(carid)
                .build());
    }
}
