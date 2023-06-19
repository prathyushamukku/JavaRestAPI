package com.example.demo.controller;

import com.example.demo.model.ProductDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String create_data() {

        return "Hello All!";

    }

    @PostMapping("/putData")
    public String post_data(@RequestBody final ProductDetails productDetails) {
        System.out.println(productDetails);
        return "123456";

    }


}
