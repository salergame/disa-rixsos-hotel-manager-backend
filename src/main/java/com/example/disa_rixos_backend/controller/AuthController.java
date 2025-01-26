package com.example.disa_rixos_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.disa_rixos_backend.model.User;
import com.example.disa_rixos_backend.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    // Разрешение CORS для frontend с http://localhost:3000
    @CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        // Проверяем, существует ли уже пользователь с таким username
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            // Если существует, возвращаем ошибку
            return ResponseEntity.badRequest().body("User already exists");
        }

        // Сохраняем нового пользователя в базу данных
        userRepository.save(user);
        // Возвращаем успешный ответ
        return ResponseEntity.ok("User registered successfully");
    }
}
