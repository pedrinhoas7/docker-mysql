package com.curso.api.controller;

import java.util.List;
import java.util.Optional;

import com.curso.api.entity.Categoria;
import com.curso.api.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getAll(){
        return categoriaService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Categoria>> getId(@PathVariable Long id){
        Optional<Categoria> categoria = categoriaService.getId(id);
        return categoria.isPresent() ? ResponseEntity.ok(categoria) : ResponseEntity.notFound().build();
    }

}
