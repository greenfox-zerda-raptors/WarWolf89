package com.greenfox.csaba.reddit.controllers;

import com.greenfox.csaba.reddit.Services.UserService;
import com.greenfox.csaba.reddit.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "/signUp";
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User User) {
        userService.save(User);
        return "redirect:/";
    }
}
