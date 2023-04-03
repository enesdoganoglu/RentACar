package com.bilgeadam.service;

import com.bilgeadam.dto.request.SaveBrandRequestDto;
import com.bilgeadam.repository.entity.Brand;
import com.bilgeadam.mapper.IBrandMapper;
import com.bilgeadam.repository.IBrandRepository;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService extends ServiceManager<Brand,Integer> {
    private final IBrandRepository brandRepository;
    public BrandService (IBrandRepository brandRepository){
        super(brandRepository);
        this.brandRepository=brandRepository;
    }
    public Brand save(SaveBrandRequestDto dto){
        Brand brand=save(IBrandMapper.INSTANCE.toBrand(dto));
        return brand;
    }
    public List<Brand> findAll() {
        List<Brand> brand=brandRepository.findAll();
        if(brand.isEmpty()){
            throw new NullPointerException("Boş");
        }
        return brand;
    }
}