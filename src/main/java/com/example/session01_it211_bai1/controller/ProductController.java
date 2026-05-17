package com.example.session01_it211_bai1.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Getter
    static class Product {

        private String id;
        private String name;
        private double price;

        public Product(String id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

    }


    @GetMapping
    public List<Product> getHotProducts() {

        List<Product> products = new ArrayList<>();

        products.add(
                new Product(
                        "HP001",
                        "Áo thun Code is Life",
                        199000
                )
        );

        products.add(
                new Product(
                        "HP002",
                        "Móc khóa Bug Free",
                        99000
                )
        );

        return products;
    }

}