package edu.pitt.isd.controller.question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.pitt.isd.controller.question.vo.AnswerVO;
import edu.pitt.isd.controller.question.vo.EvaluationVO;
import edu.pitt.isd.controller.question.vo.QuestionVO;
import edu.pitt.isd.framework.rest.RestfulResponse;
import edu.pitt.isd.framework.util.Util;
import edu.pitt.isd.service.AnswerService;
import edu.pitt.isd.service.CourseService;
import edu.pitt.isd.service.QuestionService;

@RestController
@RequestMapping("evaluation")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @Autowired
    AnswerService answerService;
    @Autowired
    CourseService courseService;

    private List<QuestionVO> list = new ArrayList<>();

    @RequestMapping("list")
    public RestfulResponse questionList() {
        if (list.size() == 0) {
            list = questionService.questionVOList();
        }
        RestfulResponse response = new RestfulResponse(1, "success", list);
        return response;
    }

    @RequestMapping(value = { "question-form/{url}" })
    public ModelAndView questionForm(ModelAndView modelAndView, @PathVariable String url) {
        if (list.size() == 0) {
            list = questionService.questionVOList();
        }

        List<QuestionVO> questions = new ArrayList<>();
        int[] questionIds = Util.randomIntArray(1, 18, true);
        for (int i : questionIds) {
            questions.add(list.get(i));
        }
        
        EvaluationVO evaluationVo = courseService.selectByUrl(url);
        
        modelAndView.addObject("url", url);
        modelAndView.addObject("evaluation", evaluationVo);
        modelAndView.addObject("questions", questions);
        modelAndView.setViewName("question/question-form");
        return modelAndView;
    }

    @RequestMapping(value = { "question" })
    public ModelAndView questionList(ModelAndView modelAndView) {
        if (list.size() == 0) {
            list = questionService.questionVOList();
        }

        modelAndView.addObject("questions", list);
        
        

        modelAndView.addObject("nav", "example-form");
        modelAndView.addObject("subnav", "");
        modelAndView.setViewName("question/questions");
        return modelAndView;
    }

    @PostMapping("submit")
    public RestfulResponse submit(@RequestBody(required = true) AnswerVO answerVo) {
        int insertOrUpdateCount = answerService.insertOrUpdate(answerVo);
        if (insertOrUpdateCount > 0) {
            return new RestfulResponse(1, insertOrUpdateCount);
        } else {
            return new RestfulResponse(0, null);
        }
    }

}
