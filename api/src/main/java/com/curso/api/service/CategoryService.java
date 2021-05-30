package com.curso.api.service;

import java.util.List;
import java.util.Optional;

import com.curso.api.entity.Category;
import com.curso.api.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> getId(Long id){
        return categoryRepository.findById(id);
    }
    
}
