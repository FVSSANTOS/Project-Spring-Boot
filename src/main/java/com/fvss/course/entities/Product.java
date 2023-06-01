package com.fvss.course.entities;

import java.util.HashSet;
import java.util.Set;

public class Product {
    
    private Long id;
    private String name;
    private String drescription;
    private Double price;
    private String imgUrl;

    private Set<Category> cateories = new HashSet<>();

    public Product(){
    }

    
}
