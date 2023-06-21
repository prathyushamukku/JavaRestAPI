package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("")
    public List<Car> getAllCars() {
        return carService.listAll();
    }

    @PostMapping("")
    public String addCars(@RequestBody Car car) {
        carService.save(car);
        return "New Car Model Added";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> get(@PathVariable String id) {
        try {
            Car car = carService.get(id);
            return new ResponseEntity<Car>(car, HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<Car>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("")
    public ResponseEntity<Car> update(@RequestBody Car car) {
        try {
            carService.save(car);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<Car>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        carService.delete(id);
        return "Deleted the car with identification number - " + id;
    }

}
