package edu.pitt.isd.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pitt.isd.controller.question.vo.AnswerVO;
import edu.pitt.isd.model.dto.Evaluation;
import edu.pitt.isd.model.mapper.AnswerMapper;

@Repository
public class AnswerDao {
    @Autowired
    AnswerMapper answerMapper;

    public int insertOrUpdate(AnswerVO answerVo, Evaluation evaluation) {
        return answerMapper.insertOrUpdate(answerVo, evaluation);
    }
}
