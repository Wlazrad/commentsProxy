package com.example.commentsproxy.placeholder;

import com.example.commentsproxy.post.dto.CommentsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "placeholder-client", url = "https://jsonplaceholder.typicode.com")
public interface PlaceholderClient {
    @GetMapping("/comments")
    List<CommentsDto> find(@RequestParam(value = "id", required = false) List<Long> ids);
}
