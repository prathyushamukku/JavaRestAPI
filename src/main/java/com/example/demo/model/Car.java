package com.example.demo.model;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
public class Car {

    @Id
    private String vin;
    private Integer year;
    private String model;
    private String type;

    public Car() {
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
