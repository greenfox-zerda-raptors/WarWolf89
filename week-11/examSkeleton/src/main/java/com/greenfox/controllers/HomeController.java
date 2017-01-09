package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by almasics on 2017.01.09..
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    private String homePageDisplay(Model model) {
        return "index";
    }
}
