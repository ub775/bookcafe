package com.springboot.init.data.dto;

public class ChangeReviewDto {

    private Long id;

    private String content;

    public ChangeReviewDto(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public ChangeReviewDto() {

    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
