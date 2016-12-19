package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.greenfoxacademy.springstart.controllers.HelloRESTController.counter;
import static com.greenfoxacademy.springstart.controllers.HelloRESTController.hellos;

/**
 * Created by almasics on 2016.12.19..
 */
@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("counter", counter.incrementAndGet());
        model.addAttribute("hellos", hellos.get(2));
        return "greeting";
    }
}
