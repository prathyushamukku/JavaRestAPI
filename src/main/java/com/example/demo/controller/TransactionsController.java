package com.example.demo.controller;

import com.example.demo.model.Transactions;
import com.example.demo.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;

    @GetMapping("")
    public List<Transactions> getAllTransactions() {
        return transactionsService.listAll();
    }

    @PostMapping("")
    public String add(@RequestBody Transactions transactions) {
        try {
            System.out.println("****************");
            System.out.println(transactions);
            System.out.println("_____________________");
            transactionsService.save(transactions);
            return "New Car Model Added";
        } catch (Exception e) {
            System.out.println(e.toString());
            return e.getLocalizedMessage();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transactions> get(@PathVariable Integer id) {
        try {
            Transactions transactions = transactionsService.get(id);
            return new ResponseEntity<Transactions>(transactions, HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<Transactions>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("")
    public ResponseEntity<Transactions> update(@RequestBody Transactions transactions) {
        try {
            transactionsService.save(transactions);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e) {
            return new ResponseEntity<Transactions>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        transactionsService.delete(id);
        return "Deleted the car with identification number - " + id;
    }


}
