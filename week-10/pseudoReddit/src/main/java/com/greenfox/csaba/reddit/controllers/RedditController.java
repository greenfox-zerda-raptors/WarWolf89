package com.greenfox.csaba.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by almasics on 2017.01.04..
 */

@Controller
public class RedditController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }

}
