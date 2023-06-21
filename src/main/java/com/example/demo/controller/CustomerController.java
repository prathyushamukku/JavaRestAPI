package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers() {

        return customerService.listAll();
    }

    @PostMapping("/add")
    public String addCustomers(@RequestBody Customer customer) {
        customerService.save(customer);
        return "New Customer Added";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> get(@PathVariable Integer id) {
        try {
            Customer customer = customerService.get(id);
            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/update")
    public ResponseEntity<Customer> update(@RequestBody Customer customer) {
        try {
            customerService.save(customer);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        customerService.delete(id);
        return "Deleted the customer with " + id;
    }

}
