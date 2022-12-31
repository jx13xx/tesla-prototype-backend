package com.rak.teslaprototype.repository;

import com.rak.teslaprototype.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findAll();

    List<Car> findAllById(Long id);
}
