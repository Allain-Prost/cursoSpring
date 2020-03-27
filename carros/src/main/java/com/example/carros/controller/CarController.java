package com.example.carros.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carros.model.Car;
import com.example.carros.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@GetMapping
	public List<Car> retrievAllCar(){
		return carService.retrievAllCar();
	}

	@GetMapping("/{carId}")
	public Optional<Car> retrieveOneCar(@PathVariable long carId) {
		return carService.retrieveOneCar(carId);
	}
	
	@PostMapping("/new")
	public ResponseEntity<Car> retrieveOneCar(@RequestBody Car car){
		return carService.createCar(car);
	}

}
