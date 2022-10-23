package com.example.commentsproxy.post.dto;

import lombok.Value;

import java.util.List;

@Value
public class CommentResponse {
    List<CommentsDto> commentsList;
}

