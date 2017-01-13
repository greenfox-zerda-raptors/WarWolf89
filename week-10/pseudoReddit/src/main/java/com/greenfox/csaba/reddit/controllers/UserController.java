package com.greenfox.csaba.reddit.controllers;

import com.greenfox.csaba.reddit.Services.UserService;
import com.greenfox.csaba.reddit.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created by almasics on 2017.01.05..
 */
@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/signUp")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "/signUp";
    }

    @PostMapping(value = "/signUp")
    public String addUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signUp";
        } else {
            userService.save(user);
        }
        return "redirect:/";
    }
}
