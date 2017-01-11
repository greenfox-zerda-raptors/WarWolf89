package com.greenfox.exams.spring.controllers;

import com.greenfox.exams.spring.domain.UserFeedback;
import com.greenfox.exams.spring.services.UserFeedbackServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * Created by almasics on 2017.01.11..
 */

@Controller
public class HomeController extends WebMvcConfigurerAdapter {

    private UserFeedbackServices userFeedbackServices;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/thankyou").setViewName("thankyou");
    }

    @Autowired
    public HomeController(UserFeedbackServices userFeedbackServices) {
        this.userFeedbackServices = userFeedbackServices;
    }

    @GetMapping(value = "/")
    private String createForm(Model model) {
        model.addAttribute("userFeedback", new UserFeedback());
        return "welcome";
    }

    @PostMapping(value = "/")
    private String submitData(@Valid UserFeedback userFeedback, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "welcome";
        } else {
            userFeedbackServices.saveData(userFeedback);
        }
        return "redirect:/thankyou";
    }

}
