package edu.pitt.isd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pitt.isd.model.dao.EvaluationDao;
import edu.pitt.isd.model.dto.Evaluation;

@Service
public class EvaluationService {
    @Autowired
    EvaluationDao evaluationDao;

    public List<Evaluation> selectByUserId(String id) {
        return evaluationDao.selectByUserId(id);
    }
}
