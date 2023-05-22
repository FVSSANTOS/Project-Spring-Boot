package com.fvss.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fvss.course.entities.Uuser;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<Uuser> findAll(){
        Uuser u = new Uuser(1L, "Maira", "maria@gmail.com","99999", "1234");
        return ResponseEntity.ok().body(u);
    }
}
