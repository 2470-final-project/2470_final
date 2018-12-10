package edu.pitt.isd.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pitt.isd.model.dto.Course;
import edu.pitt.isd.model.dto.CourseExample;
import edu.pitt.isd.model.mapper.CourseMapper;

@Repository
public class CourseDao {
    @Autowired
    CourseMapper courseMapper;

    public List<Course> selectByUserId(int id) {
        CourseExample example = new CourseExample();
        example.createCriteria().andInstructorIdEqualTo(id);
        return courseMapper.selectByExample(example);
    }

}
