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

    public int insertUser(UserVO userVO) {
        return usersDao.insertUser(userVO);
    }

    public int updateUser(UserVO userVO) {
        return usersDao.updateUser(userVO);
    }

    public UserVO selectById(Integer userId) {
        return usersDao.selectById(userId);
    }

    public int resetPassword(Integer id) {
        return usersDao.resetPassword(id);
    }

    public int toggleEnabled(Integer id, Boolean enable) {
        return usersDao.toggleEnabled(id, enable);
    }
}
