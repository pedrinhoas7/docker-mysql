package com.curso.api.controller;

import java.util.List;
import java.util.Optional;

import com.curso.api.entity.Product;
import com.curso.api.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getId(@PathVariable Long id){
        Optional<Product> produto = productService.getId(id);
        return produto.isPresent() ? ResponseEntity.ok(produto) : ResponseEntity.notFound().build();
    }
}
