package com.fvss.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.fvss.course.entities.Uuser;
import com.fvss.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TetsConfig implements CommandLineRunner{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
       
        Uuser u1 = new Uuser(null,"Maria Brown","maria@gmail.com", "988888888","123456");
        Uuser u2 = new Uuser(null,"Alex Green","alex@gmail.com", "977777777","123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }


}
