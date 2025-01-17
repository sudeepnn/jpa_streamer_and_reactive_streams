package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarEntity;
import com.example.demo.service.Carservice;

@RestController
@RequestMapping("/api/cars")
public class CarController {

	@Autowired
	Carservice sCarservice;
	
	@PostMapping
	public CarEntity savecarDetails(CarEntity entity){
		return sCarservice.savecarDetails(entity);
	}
	
	@GetMapping("/grpbycolor")
	public Map<String,List<CarEntity>> groupbycarcolor(){
		return sCarservice.groupbycarcolor();
	}
	
	@GetMapping("/grpbyyear")
	public Map<String,List<CarEntity>> groupbycaryear(){
		return sCarservice.groupbycaryear();
	}
	
	@GetMapping("/grpbyaval")
	public Map<String,List<CarEntity>> groupbycaravalable(){
		return sCarservice.groupbycaravalable();
	}
	
}
