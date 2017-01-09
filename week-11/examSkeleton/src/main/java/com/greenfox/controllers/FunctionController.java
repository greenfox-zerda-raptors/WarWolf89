package com.greenfox.controllers;

import com.greenfox.domain.DummyData;
import com.greenfox.services.DummyDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by almasics on 2017.01.09..
 */
@Controller
public class FunctionController {

    private DummyDataServices dummyDataServices;

    @Autowired
    public FunctionController(DummyDataServices dummyDataServices) {
        this.dummyDataServices = dummyDataServices;
    }

    @RequestMapping(value = "/list")
    private String listThings(Model model) {
        model.addAttribute("dataList", dummyDataServices.list());
        return "list";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    private String submitPageLoad(Model model) {
        model.addAttribute("dummyData", new DummyData());
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    private String submitData(@ModelAttribute DummyData dummyData) {
        dummyDataServices.saveData(dummyData);
        return "redirect:/list";
    }
}
