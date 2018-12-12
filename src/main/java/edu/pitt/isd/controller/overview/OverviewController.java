package edu.pitt.isd.controller.overview;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.pitt.isd.controller.question.vo.EvaluationVO;
import edu.pitt.isd.model.dto.Course;
import edu.pitt.isd.model.dto.CustomUserDetails;
import edu.pitt.isd.service.CourseService;
import edu.pitt.isd.service.EvaluationService;

@RestController
@RequestMapping("overview")
public class OverviewController {
    @Autowired
    EvaluationService evaluationService;
    @Autowired
    CourseService courseService;

    @RequestMapping(value = { "/", "" })
    public ModelAndView index(ModelAndView modelAndView) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails users = (CustomUserDetails) authentication.getPrincipal();
        List<EvaluationVO> list = evaluationService.selectVoByUserId(users.getId());

        List<Course> courses = courseService.selectByUserId(users.getId());
        modelAndView.addObject("courses", courses);
        modelAndView.addObject("evaluations", list);
        modelAndView.addObject("nav", "overview");
        modelAndView.addObject("subnav", "");
        modelAndView.setViewName("index/overview");
        return modelAndView;
    }
}
