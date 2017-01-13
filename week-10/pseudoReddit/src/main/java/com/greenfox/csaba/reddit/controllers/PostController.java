package com.greenfox.csaba.reddit.controllers;

import com.greenfox.csaba.reddit.Services.PostServices;
import com.greenfox.csaba.reddit.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created by almasics on 2017.01.04..
 */
@Controller
public class PostController {

    private PostServices postService;

    @Autowired
    public PostController(PostServices postService) {
        super();
        this.postService = postService;
    }

    @GetMapping(value = "/posts")
    public String postList(Model model) {
        model.addAttribute("posts", postService.list());
        return "posts";
    }

    @GetMapping(value = "/posts/addPage")
    public String newPost(Model model) {
        model.addAttribute("post", new Post());
        return "addPage";
    }

    @PostMapping(value = "/posts")
    public String savePost(@Valid Post post, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addPage";
        } else {
            postService.save(post);
        }
        return "redirect:/posts";
    }

    @GetMapping(value = "/posts/{id}/upVote")
    public String upVotePost(@PathVariable Long id) {
        Post currentPost = postService.get(id);
        currentPost.setScore(currentPost.getScore() + 1);
        postService.save(currentPost);
        return "redirect:/posts";
    }

    @GetMapping(value = "/posts/{id}/downVote")
    public String downVotePost(@PathVariable Long id) {
        Post currentPost = postService.get(id);
        currentPost.setScore(currentPost.getScore() - 1);
        postService.save(currentPost);
        return "redirect:/posts";
    }

}
