package com.curso.api.repository;

import com.curso.api.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
