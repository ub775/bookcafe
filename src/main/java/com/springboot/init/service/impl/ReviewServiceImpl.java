package com.springboot.init.service.impl;

import com.springboot.init.data.dto.ReviewDto;
import com.springboot.init.data.dto.ReviewResponseDto;
import com.springboot.init.data.entity.Review;
import com.springboot.init.data.repository.ReviewRepository;
import com.springboot.init.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public ReviewResponseDto getReview(Long id) {

        Review review = reviewRepository.findById(id).get();

        ReviewResponseDto reviewResponseDto = new ReviewResponseDto();
        reviewResponseDto.setId(review.getId());
        reviewResponseDto.setTitle(review.getTitle());
        reviewResponseDto.setContent(review.getContent());
        reviewResponseDto.setScore(review.getScore());

        return reviewResponseDto;
    }

    @Override
    public ReviewResponseDto saveReview(ReviewDto reviewDto) {

        Review review = new Review();
        review.setTitle(reviewDto.getTitle());
        review.setContent(reviewDto.getContent());
        review.setScore(reviewDto.getScore());
        review.setCreatedAt(LocalDateTime.now());
        review.setUpdatedAt(LocalDateTime.now());

        Review saveReview = reviewRepository.save(review);

        ReviewResponseDto reviewResponseDto = new ReviewResponseDto();
        reviewResponseDto.setId(saveReview.getId());
        reviewResponseDto.setTitle(saveReview.getTitle());
        reviewResponseDto.setContent(saveReview.getContent());
        reviewResponseDto.setScore(saveReview.getScore());

        return reviewResponseDto;
    }

    @Override
    public ReviewResponseDto updateReview(Long id, String content) throws Exception {
        Review foundReview = reviewRepository.findById(id).get();
        foundReview.setContent(content);
        Review changeReview = reviewRepository.save(foundReview);

        ReviewResponseDto reviewResponseDto = new ReviewResponseDto();
        reviewResponseDto.setId(changeReview.getId());
        reviewResponseDto.setTitle(changeReview.getTitle());
        reviewResponseDto.setContent(changeReview.getContent());
        reviewResponseDto.setScore(changeReview.getScore());

        return reviewResponseDto;
    }

    @Override
    public void deleteReview(Long id) throws Exception {
        reviewRepository.deleteById(id);
    }
}
