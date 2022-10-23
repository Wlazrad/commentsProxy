package com.example.commentsproxy.post.application;

import com.example.commentsproxy.placeholder.PlaceholderService;
import com.example.commentsproxy.post.dto.CommentsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentsHandler {
    private final PlaceholderService placeholderService;

    public List<CommentsDto> handle(List<Long> ids) {
        return placeholderService.getComments(ids);
    }
}
