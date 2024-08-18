package com.group13.shopping.controller;

import com.group13.shopping.repository.ProductRepository;
import com.group13.shopping.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    @PostMapping("/product")
    Product createProduct(@RequestBody Product newProduct) {
        return productRepository.save(newProduct);
    }

}
