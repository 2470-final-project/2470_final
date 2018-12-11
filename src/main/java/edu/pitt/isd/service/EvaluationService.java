package edu.pitt.isd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pitt.isd.controller.question.vo.EvaluationVO;
import edu.pitt.isd.model.dao.EvaluationDao;
import edu.pitt.isd.model.dto.Evaluation;

@Service
public class EvaluationService {
    @Autowired
    EvaluationDao evaluationDao;

    public List<Evaluation> selectByUserId(Integer id) {
        return evaluationDao.selectByUserId(id);
    }

    public int insert(Evaluation evaluation) {
        return evaluationDao.insert(evaluation);
    }

    public List<EvaluationVO> selectVoByUserId(int id) {
        return evaluationDao.selectVoByUserId(id);
    }
}
