package com.springboot.init.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ReviewDto {

    private String title;

    private String content;

    private int score;
}
