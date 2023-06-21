package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.model.Transactions;
import com.example.demo.repository.TransactionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionsService {

    @Autowired
    private TransactionsRepo transactionsRepo;

    public List<Transactions> listAll() {
        return transactionsRepo.findAll();
    }

    public void save(Transactions transactions) {
        transactionsRepo.save(transactions);
    }

    public Transactions get(Integer id) {

        return transactionsRepo.findById(id).get();
    }

    public void delete(Integer id) {

        transactionsRepo.deleteById(id);
    }

}
