
package com.JWTDemo.JWTDemo.controller;

import com.JWTDemo.JWTDemo.entity.Post;
import com.JWTDemo.JWTDemo.repository.PostRepository;

import jakarta.validation.Valid;

import lombok.AllArgsConstructor;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository posts;

    // Get all posts
    @GetMapping
    public List<Post> all() {
        return posts.findAllByOrderByCreatedAtDesc();
    }

    // Create a new post
    @PostMapping
    public Post create(
            @Valid @RequestBody Post req,
            Authentication auth
    ) {

        return posts.save(
                new Post(
                        req.getTitle(),
                        req.getContent(),
                        auth.getName()
                )
        );
    }
}
