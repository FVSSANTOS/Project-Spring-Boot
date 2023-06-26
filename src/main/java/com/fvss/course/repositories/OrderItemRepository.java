package com.fvss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fvss.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
    
}
