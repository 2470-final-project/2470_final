package edu.pitt.isd.model.dao;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pitt.isd.model.dto.Evaluation;
import edu.pitt.isd.model.dto.EvaluationExample;
import edu.pitt.isd.model.mapper.EvaluationMapper;

@Repository
public class EvaluationDao {
    @Autowired
    EvaluationMapper evaluationMapper;

    public List<Evaluation> selectByUserId(Integer id) {
        EvaluationExample example = new EvaluationExample();
        example.createCriteria().andUserIdEqualTo(id);
        return evaluationMapper.selectByExample(example);
    }

    public int insert(Evaluation evaluation) {

        String url = RandomStringUtils.random(6, true, true);
        EvaluationExample example = new EvaluationExample();
        example.createCriteria().andUrlEqualTo(url);
        while (evaluationMapper.selectByExample(example).size() > 0) {
            url = RandomStringUtils.random(6, true, true);
            example.createCriteria().andUrlEqualTo(url);
        }
        evaluation.setUrl(url);

        return evaluationMapper.insertSelective(evaluation);
    }
}
