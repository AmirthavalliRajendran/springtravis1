package com.kgisl.springtra.repository;

import com.kgisl.springtra.model.Car;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CarRepository
 */
public interface CarRepository extends JpaRepository<Car,Long>{

    
}
