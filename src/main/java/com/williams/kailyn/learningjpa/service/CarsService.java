package com.williams.kailyn.learningjpa.service;

import com.williams.kailyn.learningjpa.entity.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarsService {

    @Autowired
    CarsRepository carsRepository;

    public Cars getCarById(Long id){
        Optional<Cars> carById= carsRepository.findById(id);
        return carById.orElse(null);
    }

    public List<Cars> getAllCars(Optional<Integer> limitParam){
        List<Cars> carsList= carsRepository.findAll();
        Integer limit;
        if(limitParam.isEmpty())
            limit=500;
        else
            limit=limitParam.get();

        return carsList
                .stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    public void insertCar(Cars car){
        carsRepository.save(car);
    }
}
