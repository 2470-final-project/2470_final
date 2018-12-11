package edu.pitt.isd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pitt.isd.controller.question.vo.AnswerVO;
import edu.pitt.isd.model.dao.AnswerDao;
import edu.pitt.isd.model.dao.EvaluationDao;
import edu.pitt.isd.model.dto.Evaluation;

@Service
public class AnswerService {
    @Autowired
    AnswerDao answerDao;
    @Autowired
    EvaluationDao evaluationDao;

    public int insertOrUpdate(AnswerVO answerVo) {
        Evaluation evaluation = evaluationDao.selectByUrl(answerVo.getUrl());
        return answerDao.insertOrUpdate(answerVo, evaluation);
    }

}
