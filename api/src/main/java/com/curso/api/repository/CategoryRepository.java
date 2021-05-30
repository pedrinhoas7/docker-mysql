package com.curso.api.repository;

import com.curso.api.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
