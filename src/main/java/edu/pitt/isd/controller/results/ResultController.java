package edu.pitt.isd.controller.results;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("results")
public class ResultController {
    @RequestMapping("course")
    public ModelAndView course(ModelAndView modelAndView) {
        modelAndView.setViewName("results/course");
        return modelAndView;
    }
}
