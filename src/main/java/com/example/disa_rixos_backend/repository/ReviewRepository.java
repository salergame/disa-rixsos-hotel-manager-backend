package com.example.disa_rixos_backend.repository;

import com.example.disa_rixos_backend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
