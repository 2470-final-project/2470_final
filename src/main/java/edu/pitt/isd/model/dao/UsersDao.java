package edu.pitt.isd.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pitt.isd.controller.user.vo.UserVO;
import edu.pitt.isd.model.mapper.UsersMapper;

@Repository
public class UsersDao {
    @Autowired
    UsersMapper usersMapper;

    public List<UserVO> selectAll() {
        return usersMapper.selectAll();
    }
}
