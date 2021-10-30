package com.madoor.spring.jpa.Spring_JPA_Demo.service;

import com.madoor.spring.jpa.Spring_JPA_Demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
