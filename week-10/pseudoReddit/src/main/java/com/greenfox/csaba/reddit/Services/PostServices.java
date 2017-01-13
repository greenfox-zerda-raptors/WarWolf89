package com.greenfox.csaba.reddit.Services;

import com.greenfox.csaba.reddit.domain.Post;
import com.greenfox.csaba.reddit.domain.User;
import com.greenfox.csaba.reddit.repositories.PostRepository;
import com.greenfox.csaba.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * Created by almasics on 2017.01.04..
 */
@Service
public class PostServices {

    private PostRepository postRepository;
    private UserRepository userRepository;

    @Autowired
    public PostServices(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public Iterable<Post> list() {
        return postRepository.findAll();
    }

    public Post get(Long id) {
        return postRepository.findOne(id);
    }

    public Post save(Post post) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        User currentUser = userRepository.findByUserName(name);
        post.setUser(currentUser);
        return postRepository.save(post);
    }

}

