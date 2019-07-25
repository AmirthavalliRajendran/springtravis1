package com.kgisl.springtra.service;

import java.util.List;

import com.kgisl.springtra.model.Car;
import com.kgisl.springtra.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarServiceImpl
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getCars() {
        System.out.println(""+carRepository.findAll());
        return carRepository.findAll();
    }

}