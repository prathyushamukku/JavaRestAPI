package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> listAll() {
        return customerRepo.findAll();
    }

    public void save(Customer customer) {
        customerRepo.save(customer);
    }

    public Customer get(Integer id) {
        return customerRepo.findById(id).get();
    }

    public void delete(Integer id) {
        customerRepo.deleteById(id);
    }

}
