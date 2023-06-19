package com.fvss.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fvss.course.entities.Product;
import com.fvss.course.repositories.ProductRepository;

public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
     Optional<Product> obj = repository.findById(id);
     return obj.get();
    }
}
