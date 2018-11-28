package edu.pitt.isd.controller.question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.pitt.isd.controller.question.vo.QuestionVO;
import edu.pitt.isd.framework.rest.RestfulResponse;
import edu.pitt.isd.framework.util.Util;
import edu.pitt.isd.service.QuestionService;

@RestController
@RequestMapping("evaluation")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    private List<QuestionVO> list = new ArrayList<>();

    @RequestMapping("list")
    public RestfulResponse questionList() {
        List<QuestionVO> list = questionService.questionVOList();
        RestfulResponse response = new RestfulResponse(1, "success", list);
        return response;
    }

    @RequestMapping("question")
    public ModelAndView questionList(ModelAndView modelAndView) {
        if (list.size() == 0) {
            list = questionService.questionVOList();
        }

        List<QuestionVO> questions = new ArrayList<>();
        int[] questionIds = Util.randomIntArray(1, 18, true);
        for (int i : questionIds) {
            questions.add(list.get(i));
        }

        modelAndView.addObject("questions", questions);
        modelAndView.setViewName("question/questions");
        return modelAndView;
    }

}
