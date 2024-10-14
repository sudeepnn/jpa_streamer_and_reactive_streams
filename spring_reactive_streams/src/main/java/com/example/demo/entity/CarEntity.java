package com.example.demo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CarsRecord")
public class CarEntity {
	@Id
	private Long id;
	String manufacturecompany;
	String model;
	String  year;
	String color;
    String mileage;
    long price;
    String engineType;
    String transmission;
    String fuelEfficiency;
    String availablestatus;
    List<String> features;
    String manufactureddate;
    String discription;
    String wheeltype;
    int airbags;
}
