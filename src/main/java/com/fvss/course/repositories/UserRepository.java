package com.fvss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fvss.course.entities.Uuser;

public interface UserRepository extends JpaRepository<Uuser, Long>{
    
    
}
