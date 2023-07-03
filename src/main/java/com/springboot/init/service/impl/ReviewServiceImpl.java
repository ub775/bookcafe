package com.springboot.init.service.impl;

import com.springboot.init.data.dto.ReviewDto;
import com.springboot.init.data.dto.ReviewResponseDto;
import com.springboot.init.service.ReviewService;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public ReviewResponseDto getReview(Long id) {
        return null;
    }

    @Override
    public ReviewResponseDto saveReview(ReviewDto reviewDto) {
        return null;
    }

    @Override
    public ReviewResponseDto updateReview(Long id, String content) throws Exception {
        return null;
    }

    @Override
    public void deleteReview(Long id) throws Exception {

    }
}
