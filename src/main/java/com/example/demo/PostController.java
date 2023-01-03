package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PostController {

    //    private PostDao postDao;
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);


    @QueryMapping
    public List<Post> recentPosts(@Argument int count, @Argument int offset) {
        return List.of();
    }

    @GetMapping("/hello")
    String hello() {
        return "hello";
    }

    @MutationMapping
    public Post addPost(@Argument String id, @Argument String title, @Argument String category, @Argument String authorId) {
        logger.info("Adding a post");

        return new Post(id, title, category, authorId);
    }

}