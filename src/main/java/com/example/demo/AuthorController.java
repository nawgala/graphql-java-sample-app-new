package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    private AuthorDao authorDao;
    private static final Logger logger = LoggerFactory.getLogger(AuthorController.class);

    public AuthorController(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }


//    @SchemaMapping
//    public void author(Post post) {
//        logger.info("Loading Author from post to set to schema"  + post.toString());
//        authorDao.getAuthor(post.getAuthorId());
//    }
}
