package com.sistemadevenda.sistema.controller;


import com.sistemadevenda.sistema.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sistemadevenda.sistema.service.ProductService;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(Long id){
        return ResponseEntity.ok(Product);
    }

}
