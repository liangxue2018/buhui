package com.buhui.buhui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/learn")
public class Controlller {
    @Autowired
    private Service service;

    @RequestMapping("")
    public ModelAndView index() {
        List<LearnResouce> learnList = service.print();
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }

}
