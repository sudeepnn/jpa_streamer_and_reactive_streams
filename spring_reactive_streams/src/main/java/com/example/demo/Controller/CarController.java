package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CarService;
import com.example.demo.entity.CarEntity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	
	@Autowired
	CarService service;
	
	@GetMapping("{}")
	public Mono<CarEntity> getaCarDetails(@PathVariable long id){
		return service.getaCarDetails(id);
	}
	
	@GetMapping
	public Flux<CarEntity> getAllcardetails(){
		return service.getAllcardetails();
	}
	
	@PostMapping
	public Mono<CarEntity> savecarDetails(CarEntity entity){
		return service.savecarDetails(entity);
	}
	
	@DeleteMapping("{id}")
	public Mono<CarEntity> deleteCarDetails(@PathVariable long id){
		Mono<CarEntity> carEntity=getaCarDetails(id);
		service.deleteCarDetails(id);
		return carEntity;
	}

}
