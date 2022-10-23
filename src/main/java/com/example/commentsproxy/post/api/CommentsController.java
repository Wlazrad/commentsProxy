package com.example.commentsproxy.post.api;

import com.example.commentsproxy.post.application.CommentsHandler;
import com.example.commentsproxy.post.dto.CommentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin
public class CommentsController {
    private final CommentsHandler commentsHandler;

    @GetMapping(value = "/comments")
    public ResponseEntity<CommentResponse> getPost(@RequestParam(required = false) List<Long> ids) {
        return new ResponseEntity<>(new CommentResponse(commentsHandler.handle(ids)), HttpStatus.OK);
    }
}
