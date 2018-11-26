package edu.pitt.isd.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pitt.isd.controller.question.vo.QuestionAndOptionVO;
import edu.pitt.isd.controller.question.vo.QuestionVO;
import edu.pitt.isd.model.dao.QuestionDao;
import edu.pitt.isd.model.dto.QuestionOption;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<QuestionVO> questionVOList() {
        List<QuestionAndOptionVO> flatList = selectQuestionAndOpition();
        Map<Integer, QuestionVO> map = new HashMap<>();
        for (QuestionAndOptionVO flat : flatList) {
            if (!map.containsKey(flat.getId())) {
                QuestionVO questionVO = new QuestionVO();
                questionVO.setId(flat.getId());
                questionVO.setBlock(flat.getBlock());
                questionVO.setType(flat.getType());
                questionVO.setQuestion(flat.getQuestion());
                questionVO.setOptions(new ArrayList<>());
                QuestionOption option = new QuestionOption();
                option.setOption(flat.getOption());
                option.setOptionNumber(flat.getOptionNumber());
                questionVO.getOptions().add(option);
                map.put(flat.getId(), questionVO);
            } else {
                QuestionOption option = new QuestionOption();
                option.setOption(flat.getOption());
                option.setOptionNumber(flat.getOptionNumber());
                map.get(flat.getId()).getOptions().add(option);
            }
        }
        List<Integer> keys = new ArrayList<Integer>();
        keys.addAll(map.keySet());
        Collections.sort(keys);
        List<QuestionVO> list = new ArrayList<>();
        for (Integer key : keys) {
            list.add(map.get(key));
        }
        return list;
    }

    public List<QuestionAndOptionVO> selectQuestionAndOpition() {
        return questionDao.selectQuestionAndOpition();
    }

}
