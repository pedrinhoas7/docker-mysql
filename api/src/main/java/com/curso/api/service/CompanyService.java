package com.curso.api.service;

import java.util.List;
import java.util.Optional;

import com.curso.api.entity.Company;
import com.curso.api.repository.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAll(){
        return companyRepository.findAll();
    }
    
    public Optional<Company> getId(Long id){
        return companyRepository.findById(id);
    }

    
}
