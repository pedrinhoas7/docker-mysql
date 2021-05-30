package com.curso.api.service;

import java.util.List;
import java.util.Optional;

import com.curso.api.entity.Product;
import com.curso.api.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }
    public Optional<Product> getId(Long id){
        return productRepository.findById(id);
    }
}
