package com.fvss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fvss.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
    
}
