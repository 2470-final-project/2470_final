package edu.pitt.isd.controller.evaluation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.pitt.isd.framework.rest.RestfulResponse;
import edu.pitt.isd.model.dto.Course;
import edu.pitt.isd.model.dto.CustomUserDetails;
import edu.pitt.isd.model.dto.Evaluation;
import edu.pitt.isd.service.CourseService;
import edu.pitt.isd.service.EvaluationService;

@RestController
@RequestMapping(value = "evaluation")
public class EvaluationController {
    @Autowired
    EvaluationService evaluationService;
    @Autowired
    CourseService courseService;

    @GetMapping("my")
    public ModelAndView userEvaluationList(ModelAndView modelAndView) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails users = (CustomUserDetails) authentication.getPrincipal();
        List<Evaluation> list = evaluationService.selectByUserId(users.getId());
        
        modelAndView.addObject("evaluations", list);
        modelAndView.setViewName("evaluation/my");
        
        return modelAndView;

    }

    @GetMapping("builder")
    public ModelAndView builderPage(ModelAndView modelAndView) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails user = (CustomUserDetails) authentication.getPrincipal();
        int id = user.getId();

        List<Course> list = courseService.selectByUserId(id);
        modelAndView.addObject("courses", list);

        modelAndView.addObject("nav", "builder");
        modelAndView.addObject("subnav", "");
        modelAndView.setViewName("evaluation/builder");
        return modelAndView;
    }

    @PutMapping("create")
    public RestfulResponse createEvaluation(@RequestBody Evaluation evaluation) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails user = (CustomUserDetails) authentication.getPrincipal();
        int id = user.getId();
        evaluation.setUserId(id);
        int res = evaluationService.insert(evaluation);
        if (res == 1) {
            return new RestfulResponse(1, "success", res);
        } else {
            return new RestfulResponse(0, "failed", res);
        }
    }

}
