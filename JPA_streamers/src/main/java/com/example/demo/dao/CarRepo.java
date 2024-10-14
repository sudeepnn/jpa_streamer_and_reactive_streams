package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CarEntity;

public interface CarRepo extends JpaRepository<CarEntity, Long> {

}
