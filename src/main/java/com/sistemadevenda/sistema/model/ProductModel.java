package com.sistemadevenda.sistema.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductModel {

    @Id
    @GeneratedValue (GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;



}
