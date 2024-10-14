package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CarRepository;
import com.example.demo.entity.CarEntity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CarService {
	@Autowired
	CarRepository repository;
	
	public Mono<CarEntity> getaCarDetails(long id){
		return repository.findById(id);
	}
	
	public Flux<CarEntity> getAllcardetails(){
		return repository.findAll();
	}
	
	public Mono<CarEntity> savecarDetails(CarEntity entity){
		return repository.save(entity);
	}
	
	public Mono<CarEntity> deleteCarDetails(long id){
		Mono<CarEntity> carEntity=getaCarDetails(id);
		repository.deleteById(id);
		return carEntity;
	}

}
