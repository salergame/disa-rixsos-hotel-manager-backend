package com.example.disa_rixos_backend.controller;

import com.example.disa_rixos_backend.model.Review;
import com.example.disa_rixos_backend.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @PostMapping
    public ResponseEntity<?> leaveReview(@RequestBody Review review) {
        reviewRepository.save(review);
        return ResponseEntity.ok("Review saved successfully");
    }

    @GetMapping
    public ResponseEntity<?> getAllReviews() {
        return ResponseEntity.ok(reviewRepository.findAll());
    }
}
