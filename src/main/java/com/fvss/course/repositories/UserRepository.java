package com.fvss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fvss.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    
}
