package com.bilgeadam.service;

import com.bilgeadam.dto.request.SaveRentalRequestDto;
import com.bilgeadam.exception.AracKiralamaException;
import com.bilgeadam.exception.ErrorType;
import com.bilgeadam.mapper.IRentalMapper;
import com.bilgeadam.repository.IRentalRepository;
import com.bilgeadam.repository.entity.Rental;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService extends ServiceManager<Rental,Integer> {

    private final IRentalRepository repository;
    public RentalService(IRentalRepository repository){
        super(repository);
        this.repository=repository;
    }
    public Rental save(SaveRentalRequestDto dto){
        Rental rental=save(IRentalMapper.INSTANCE.toRental(dto));
        return rental;
    }
    public List<Rental> findAll() {
        List<Rental> rentals=repository.findAll();
        if(rentals.isEmpty()){
            throw new AracKiralamaException(ErrorType.CAR_NOT_FOUND);
        }
        return rentals;
    }
}