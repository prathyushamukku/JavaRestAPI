package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public Integer addCustomers(@RequestBody Customer customer) {
        System.out.println("entered customer saving !!!!!!!!!!!!!!!!");
        customerService.save(customer);
        System.out.println(customer.toString());
        System.out.println("New Customer Added");
        return customer.getPid();
    }

}
