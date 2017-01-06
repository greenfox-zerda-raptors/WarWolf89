package com.greenfox.csaba.reddit.Services;

import com.greenfox.csaba.reddit.domain.Post;
import com.greenfox.csaba.reddit.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by almasics on 2017.01.04..
 */
@Service
public class PostServices {

    private PostRepository postRepository;

    @Autowired
    public PostServices(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> list() {
        return postRepository.findAll();
    }

    public Post get(Long id) {
        return postRepository.findOne(id);
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

}

