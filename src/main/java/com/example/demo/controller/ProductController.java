package com.example.demo.controller;

import com.example.demo.model.ProductDetails;
import com.example.demo.model.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/getData")
    public List<ProductDetails> getAllProducts() {
        List<ProductDetails> result = new ArrayList<>();

        result.add(new ProductDetails("234", "Durable", 8000, 7));
        result.add(new ProductDetails("456", "Long lasting", 9000, 3));

        return result;

    }

    @PostMapping("/createData")
    public ResponseEntity<ProductResponse> createData(@RequestBody final ProductDetails productDetails) {
        System.out.println(productDetails);
        ProductResponse productResponse = new ProductResponse(productDetails.getPid());
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(productResponse);

    }


}
