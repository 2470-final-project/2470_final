package edu.pitt.isd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pitt.isd.controller.user.vo.UserVO;
import edu.pitt.isd.model.dao.UsersDao;

@Service
public class UsersService {
    @Autowired
    UsersDao usersDao;

    public List<UserVO> selectAll() {
        return usersDao.selectAll();
    }
}
