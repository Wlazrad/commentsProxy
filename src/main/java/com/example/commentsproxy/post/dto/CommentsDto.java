package com.example.commentsproxy.post.dto;

import lombok.Value;

@Value
public class CommentsDto {
    Long postId;
    Long id;
    String name;
    String email;
    String body;
}
