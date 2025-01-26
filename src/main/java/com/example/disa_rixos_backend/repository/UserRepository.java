package com.example.disa_rixos_backend.repository;

import com.example.disa_rixos_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}