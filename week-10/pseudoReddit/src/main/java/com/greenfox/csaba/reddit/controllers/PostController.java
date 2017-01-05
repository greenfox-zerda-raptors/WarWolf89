package com.greenfox.csaba.reddit.controllers;

import com.greenfox.csaba.reddit.Services.PostServices;
import com.greenfox.csaba.reddit.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String postList(Model model) {
        model.addAttribute("posts", postService.list());
        return "posts";
    }

    @RequestMapping(value = "/posts/addPage", method = RequestMethod.GET)
    public String newPost(Model model) {
        model.addAttribute(new Post());
        return "/addPage";
    }

    @RequestMapping(value = "/posts/addPage", method = RequestMethod.POST)
    public String savePost(@ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/posts/{id}/upVote")
    public String upVotePost(@PathVariable Long id) {
        Post currentPost = postService.get(id);
        currentPost.setScore(currentPost.getScore() + 1);
        postService.save(currentPost);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/posts/{id}/downVote")
    public String downVotePost(@PathVariable Long id) {
        Post currentPost = postService.get(id);
        currentPost.setScore(currentPost.getScore() - 1);
        postService.save(currentPost);
        return "redirect:/posts";
    }

}
