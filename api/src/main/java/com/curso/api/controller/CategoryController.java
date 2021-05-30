package com.curso.api.controller;

import java.util.List;
import java.util.Optional;

import com.curso.api.entity.Category;
import com.curso.api.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> getId(@PathVariable Long id){
        Optional<Category> category = categoryService.getId(id);
        return category.isPresent() ? ResponseEntity.ok(category) : ResponseEntity.notFound().build();
    }

}
