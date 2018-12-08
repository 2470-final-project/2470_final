package edu.pitt.isd.controller.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.pitt.isd.controller.user.vo.UserVO;
import edu.pitt.isd.framework.rest.RestfulResponse;
import edu.pitt.isd.service.UsersService;

@RestController
@RequestMapping("/user")
public class UserController {
    // private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UsersService usersService;

    @RequestMapping("/management")
    public ModelAndView userManagement(ModelAndView modelAndView) {
        modelAndView.addObject("nav", "user");
        modelAndView.addObject("subnav", "");
        modelAndView.setViewName("user/management");
        return modelAndView;
    }

    @GetMapping(value = { "/user", "/user/{id}" })
    public RestfulResponse userList(@PathVariable Optional<Integer> id) {
        if (id.isPresent()) {
            UserVO userVO = usersService.selectById(id.get());
            RestfulResponse response = new RestfulResponse(1, "success", userVO);
            return response;
        } else {
            List<UserVO> list = usersService.selectAll();
            RestfulResponse response = new RestfulResponse(1, "success", list);
            return response;
        }
    }

    @PutMapping("/user")
    public RestfulResponse createOrUpdateUser(@RequestBody(required = true) UserVO userVO) {
        int updatedRow;
        if (userVO.getId() == null) {
            updatedRow = usersService.insertUser(userVO);
        } else {
            updatedRow = usersService.updateUser(userVO);
        }
        RestfulResponse response = new RestfulResponse(1, "success", updatedRow);
        return response;
    }

    @PatchMapping("/reset_password/{id}")
    public RestfulResponse resetPassword(@PathVariable Integer id) {
        int res = usersService.resetPassword(id);
        RestfulResponse response = new RestfulResponse(1, "success", res);
        return response;
    }

    @PatchMapping("/toggle_enable/{id}")
    public RestfulResponse toggleEnableUser(@PathVariable Integer id, @RequestBody(required = true) Boolean enable) {
        int res = usersService.toggleEnabled(id, enable);
        RestfulResponse response = new RestfulResponse(1, "success", res);
        return response;
    }

}
