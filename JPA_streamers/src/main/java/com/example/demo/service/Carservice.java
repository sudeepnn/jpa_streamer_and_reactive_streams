package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CarRepo;
import com.example.demo.entity.CarEntity;
import com.speedment.jpastreamer.application.JPAStreamer;


@Service
public class Carservice {
	@Autowired
	CarRepo repo;
	
	@Autowired
	private  JPAStreamer jpaStreamer;
	
	public CarEntity savecarDetails(CarEntity entity){
		return repo.save(entity);
	}
	
	public Map<String,List<CarEntity>> groupbycarcolor(){
		return jpaStreamer.stream(CarEntity.class).collect(Collectors.groupingBy(CarEntity::getColor));
	}
	
	public Map<String,List<CarEntity>> groupbycaryear(){
		return jpaStreamer.stream(CarEntity.class).collect(Collectors.groupingBy(CarEntity::getYear));
	}
	public Map<String,List<CarEntity>> groupbycaravalable(){
		return jpaStreamer.stream(CarEntity.class).collect(Collectors.groupingBy(CarEntity::getAvailablestatus));
	}
	
	
}
