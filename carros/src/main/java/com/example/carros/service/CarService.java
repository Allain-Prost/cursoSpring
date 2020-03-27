package com.example.carros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.carros.model.Car;
import com.example.carros.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;
	
	public Optional<Car> retrieveOneCar(long carId) {
		return carRepository.findById(carId);
	}

	public ResponseEntity<Car> createCar(Car car) {
		Car createdCar = carRepository.save(car);
		return new ResponseEntity<Car> (createdCar,HttpStatus.OK);
	}

	public List<Car> retrievAllCar() {
		return carRepository.findAll();
	}

}
