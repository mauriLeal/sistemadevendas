package com.sistemadevenda.sistema.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Table(name = "movies")
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

}
