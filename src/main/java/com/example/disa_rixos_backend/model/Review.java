package com.example.disa_rixos_backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;
    private Integer rating;
    private String content;
    private Integer likes;
    private LocalDateTime date = LocalDateTime.now();

    
    // Конструкторы, геттеры, сеттеры, toString
}