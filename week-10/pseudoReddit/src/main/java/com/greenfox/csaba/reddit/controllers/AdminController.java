package com.greenfox.csaba.reddit.controllers;

import com.greenfox.csaba.reddit.Services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
@Secured({"ROLE_ADMIN"})
public class AdminController {

    private PostServices postService;

    @Autowired
    public AdminController(PostServices postService) {
        this.postService = postService;
    }

    @RequestMapping("/posts")
    public String list(Model model) {
        model.addAttribute("posts", postService.list());
        return "posts";
    }

    @RequestMapping("/post/{id}")
    public String view(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.get(id));
        return "posts";
    }

}
