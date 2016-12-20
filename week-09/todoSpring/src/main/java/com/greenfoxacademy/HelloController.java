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

    @RequestMapping("/helloworld")
    public String greeting(Model model, @RequestParam(required = false, defaultValue = "Thymeleaf") String name) {
        model.addAttribute("name", name);
        return "htmlTemplate";
    }
}
