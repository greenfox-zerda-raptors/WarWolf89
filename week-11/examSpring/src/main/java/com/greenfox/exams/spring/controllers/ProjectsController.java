package com.greenfox.exams.spring.controllers;

import com.greenfox.exams.spring.services.ProjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by almasics on 2017.01.11..
 */
@Controller
public class ProjectsController {

    private ProjectServices projectServices;

    @Autowired

    public ProjectsController(ProjectServices projectServices) {
        this.projectServices = projectServices;
    }

    @RequestMapping(value = "/thankyou", method = RequestMethod.GET)
    public String projectList(Model model) {
        model.addAttribute("projects", projectServices.list());
        return "thankyou";
    }
}
