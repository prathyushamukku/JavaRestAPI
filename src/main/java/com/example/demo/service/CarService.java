package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepo carRepo;

    public List<Car> listAll() {
        return carRepo.findAll();
    }

    public void save(Car car) {
        carRepo.save(car);
    }

    public Car get(String id) {

        return carRepo.findById(id).get();
    }

    public void delete(String id) {

        carRepo.deleteById(id);
    }


}
