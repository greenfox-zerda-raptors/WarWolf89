package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by almasics on 2016.12.20..
 */

@Controller
public class ToDoController {
    @RequestMapping(value = {"/todo", "/", "list"})
    public String greeting(Model model, String name) {
    }

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


}
