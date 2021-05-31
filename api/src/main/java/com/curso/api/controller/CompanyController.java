package com.curso.api.controller;

import java.util.List;
import java.util.Optional;

import com.curso.api.entity.Company;
import com.curso.api.service.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> getAll(){
        return companyService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Company>> getId(@PathVariable Long id){
        Optional<Company> company = companyService.getId(id);
        return company.isPresent() ? ResponseEntity.ok(company) : ResponseEntity.notFound().build();
    }

    
}
