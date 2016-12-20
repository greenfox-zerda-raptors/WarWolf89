package com.greenfoxacademy;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by almasics on 2016.12.20..
 */
@Getter
@Controller
public class HelloController {

    String name;

    @RequestMapping("/helloworld")
    public String greeting(Model model, @RequestParam(required = false, defaultValue = "Thymeleaf") String name) {
        this.name = name;
        model.addAttribute("name", name);
        String greeting = String.format("Hello %s", name);
        return "htmlTemplate";
    }
}
