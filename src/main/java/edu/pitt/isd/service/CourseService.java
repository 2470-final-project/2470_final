package edu.pitt.isd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pitt.isd.controller.question.vo.EvaluationVO;
import edu.pitt.isd.model.dao.CourseDao;
import edu.pitt.isd.model.dto.Course;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public List<Course> selectByUserId(int id) {
        return courseDao.selectByUserId(id);
    }

    public EvaluationVO selectByUrl(String url) {
        return courseDao.selectByUrl(url);
    }
}
