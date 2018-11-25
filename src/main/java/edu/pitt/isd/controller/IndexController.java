package edu.pitt.isd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.addObject("nav", "home");
        modelAndView.addObject("subnav", "");
        modelAndView.setViewName("index/home");
        return modelAndView;
    }

}
