package com.sistemadevenda.sistema.repository;

import com.sistemadevenda.sistema.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
