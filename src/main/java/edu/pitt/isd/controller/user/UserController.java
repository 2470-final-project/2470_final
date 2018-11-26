package edu.pitt.isd.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.pitt.isd.controller.user.vo.UserVO;
import edu.pitt.isd.framework.rest.RestfulResponse;
import edu.pitt.isd.service.UsersService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UsersService usersService;

    @RequestMapping("/management")
    public ModelAndView userManagement(ModelAndView modelAndView) {
        modelAndView.addObject("nav", "user");
        modelAndView.addObject("subnav", "");
        modelAndView.setViewName("user/management");
        return modelAndView;
    }

    @RequestMapping("/users")
    public RestfulResponse userList() {
        List<UserVO> list = usersService.selectAll();
        RestfulResponse response = new RestfulResponse(1, "success", list);
        return response;
    }

}
