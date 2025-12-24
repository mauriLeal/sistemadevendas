package com.sistemadevenda.sistema.controller;


import com.sistemadevenda.sistema.model.Product;
import com.sistemadevenda.sistema.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sistemadevenda.sistema.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        Product newProduct = productService.createProduct(product);

        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }

}
