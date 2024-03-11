package com.ainun.elasticsearch.controller;

import com.ainun.elasticsearch.entity.Product;
import com.ainun.elasticsearch.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/get-products")
    Iterable<Product> getAllProducts() {
        return service.getProducts();
    }
    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product) {
        return service.insertProduct(product);
    }
}
