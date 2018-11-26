package edu.pitt.isd.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pitt.isd.controller.question.vo.QuestionAndOptionVO;
import edu.pitt.isd.model.mapper.QuestionMapper;

@Repository
public class QuestionDao {
    @Autowired
    QuestionMapper questionMapper;

    public List<QuestionAndOptionVO> selectQuestionAndOpition() {
        return questionMapper.selectQuestionAndOption();
    }

}
