package com.example.disa_rixos_backend.controller;

import com.example.disa_rixos_backend.model.Review;
import com.example.disa_rixos_backend.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping
    public List<Review> getReviews() {
        return reviewRepository.findAllByOrderByDateDesc();
    }

    @PostMapping
    public ResponseEntity<?> addReview(@RequestBody Review review) {
        reviewRepository.save(review);
        return ResponseEntity.ok("Review added");
    }
}
