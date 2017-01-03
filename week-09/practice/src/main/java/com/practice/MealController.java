package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by almasics on 2016.12.30..
 */
@Controller
public class MealController {

    private MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        super();
        this.mealService = mealService;
    }

    @RequestMapping(value = "/mealList", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("meals", mealService.list());
        return "mealList";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String newTodo(Model model) {
        model.addAttribute("meal", new Meal());
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveTodo(@ModelAttribute Meal meal) {
        mealService.save(meal);
        return "redirect:/mealList";
    }
}

