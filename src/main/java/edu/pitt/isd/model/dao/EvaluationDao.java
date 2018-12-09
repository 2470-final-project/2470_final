package edu.pitt.isd.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pitt.isd.model.dto.Evaluation;
import edu.pitt.isd.model.dto.EvaluationExample;
import edu.pitt.isd.model.mapper.EvaluationMapper;

@Repository
public class EvaluationDao {
    @Autowired
    EvaluationMapper evaluationMapper;

    public List<Evaluation> selectByUserId(String id) {
        EvaluationExample example = new EvaluationExample();
        example.createCriteria().andUserIdEqualTo(1);
        return evaluationMapper.selectByExample(example);
    }
}
