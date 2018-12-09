package edu.pitt.isd.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.pitt.isd.controller.user.vo.UserVO;
import edu.pitt.isd.model.dto.Authorities;
import edu.pitt.isd.model.dto.AuthoritiesExample;
import edu.pitt.isd.model.dto.Users;
import edu.pitt.isd.model.dto.UsersExample;
import edu.pitt.isd.model.mapper.AuthoritiesMapper;
import edu.pitt.isd.model.mapper.UsersMapper;

@Repository
public class UsersDao {

    @Value("${default-password}")
    private String defaultPassword;

    @Autowired
    UsersMapper usersMapper;

    @Autowired
    AuthoritiesMapper authoritiesMapper;

    public List<UserVO> selectAll() {
        return usersMapper.selectAll();
    }

    public UserVO selectById(int userId) {
        return usersMapper.selectUserVOByPrimaryKey(userId);
    }

    @Transactional
    public int insertUser(UserVO userVO) {
        Users users = new Users();
        users.setUsername(userVO.getUsername());
        users.setFirstname(userVO.getFirstname());
        users.setLastname(userVO.getLastname());

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String pwdString = encoder.encode(defaultPassword);
        users.setPassword(pwdString);

        int res = usersMapper.insertSelective(users);
        if (res == 1) {
            Authorities authorities = new Authorities();
            authorities.setId(users.getId());
            authorities.setUsername(userVO.getUsername());
            authorities.setAuthority(userVO.getRole());
            res = authoritiesMapper.insertSelective(authorities);
        }
        return res;
    }

    @Transactional
    public int updateUser(UserVO userVO) {
        Users users = new Users();
        users.setId(userVO.getId());
        users.setFirstname(userVO.getFirstname());
        users.setLastname(userVO.getLastname());

        Authorities authorities = new Authorities();
        authorities.setId(userVO.getId());
        authorities.setAuthority(userVO.getRole());

        int res = usersMapper.updateByPrimaryKeySelective(users);
        if (res == 1) {
            AuthoritiesExample example = new AuthoritiesExample();
            example.createCriteria().andIdEqualTo(userVO.getId());
            res = authoritiesMapper.updateByExampleSelective(authorities, example);
        }
        return res;
    }

    public int resetPassword(Integer id) {
        Users users = new Users();
        users.setId(id);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        users.setPassword(encoder.encode(defaultPassword));
        return usersMapper.updateByPrimaryKeySelective(users);
    }

    public int toggleEnabled(Integer id, Boolean enable) {
        Users users = new Users();
        users.setId(id);
        users.setEnabled(enable);
        return usersMapper.updateByPrimaryKeySelective(users);
    }

    public UserVO selectByUsername(String name) {
        return usersMapper.selectByUsername(name);
    }

}
