package com.madoor.spring.jpa.Spring_JPA_Demo;

import com.madoor.spring.jpa.Spring_JPA_Demo.entity.User;
import com.madoor.spring.jpa.Spring_JPA_Demo.service.UserDAOService;
import com.madoor.spring.jpa.Spring_JPA_Demo.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);
        log.info("New User created: " + user);
    }
}
