package com.springboot.init.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReviewResponseDto {

    private Long id;

    private String title;

    private String content;

    private int score;
}
