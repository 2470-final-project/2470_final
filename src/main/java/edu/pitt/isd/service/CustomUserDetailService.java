package edu.pitt.isd.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pitt.isd.controller.user.vo.UserVO;
import edu.pitt.isd.model.dao.UsersDao;
import edu.pitt.isd.model.dto.CustomUserDetails;

@Service("customUserDetailService")
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UsersDao userDao;

    @Transactional(readOnly = true)
    @Override
    public CustomUserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {

        List<UserVO> user = userDao.selectByUsername(username);
        List<GrantedAuthority> authorities = buildUserAuthority(user);

        UserVO vo = user.get(0);

        return buildUserForAuthentication(vo, authorities);

    }

    private CustomUserDetails buildUserForAuthentication(UserVO user, List<GrantedAuthority> authorities) {
        User myUserDetails = new User(user.getUsername(), user.getPassword(), user.getEnabled(), true, true, true, authorities);
        CustomUserDetails customUserDetails = new CustomUserDetails(myUserDetails);
        customUserDetails.setId(user.getId());
        customUserDetails.setFirstname(user.getFirstname());
        customUserDetails.setLastname(user.getLastname());
        return customUserDetails;
    }

    private List<GrantedAuthority> buildUserAuthority(List<UserVO> user) {
        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
        for (UserVO vo : user) {
            setAuths.add(new SimpleGrantedAuthority(vo.getRole()));
        }
        List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

        return Result;
    }
}