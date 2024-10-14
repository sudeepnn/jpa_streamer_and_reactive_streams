package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CarEntity;

@Repository
public interface CarRepository extends ReactiveMongoRepository<CarEntity, Long>{

}
