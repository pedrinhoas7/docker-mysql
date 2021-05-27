package com.curso.api.service;

import java.util.List;
import java.util.Optional;

import com.curso.api.entity.Categoria;
import com.curso.api.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAll(){
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> getId(Long id){
        return categoriaRepository.findById(id);
    }
    
}
