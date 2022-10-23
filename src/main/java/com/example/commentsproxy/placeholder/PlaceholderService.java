package com.example.commentsproxy.placeholder;

import com.example.commentsproxy.post.dto.CommentsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceholderService {
    private final PlaceholderClient placeholderClient;

    public List<CommentsDto> getComments(List<Long> ids) {
        return placeholderClient.find(ids);
    }
}
