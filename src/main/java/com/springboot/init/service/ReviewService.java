package com.springboot.init.service;

import com.springboot.init.data.dto.ReviewDto;
import com.springboot.init.data.dto.ReviewResponseDto;

public interface ReviewService {

    ReviewResponseDto getReview(Long id);

    ReviewResponseDto saveReview(ReviewDto reviewDto);

    ReviewResponseDto updateReview(Long id, String content) throws Exception;

    void deleteReview(Long id) throws Exception;

}
