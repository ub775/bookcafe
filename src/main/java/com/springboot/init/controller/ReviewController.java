package com.springboot.init.controller;

import com.springboot.init.data.dto.*;
import com.springboot.init.data.repository.ReviewRepository;
import com.springboot.init.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public ResponseEntity<ReviewResponseDto> getReview(Long id) {

        ReviewResponseDto reviewResponseDto = reviewService.getReview(id);

        return ResponseEntity.status(HttpStatus.OK).body(reviewResponseDto);
    }

    @PostMapping
    public ResponseEntity<ReviewResponseDto> createReview(@RequestBody ReviewDto reviewDto) {

        ReviewResponseDto reviewResponseDto = reviewService.saveReview(reviewDto);

        return ResponseEntity.status(HttpStatus.OK).body(reviewResponseDto);
    }

    @PutMapping
    public ResponseEntity<ReviewResponseDto> updateReview(
            @RequestBody ChangeReviewDto changeReviewDto) throws Exception {

        ReviewResponseDto reviewResponseDto = reviewService.updateReview(
                changeReviewDto.getId(),
                changeReviewDto.getContent());

        return ResponseEntity.status(HttpStatus.OK).body(reviewResponseDto);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteReview(Long id) throws Exception {

        reviewService.deleteReview(id);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }

}
