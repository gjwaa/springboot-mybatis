package com.gjw.controller;

import com.gjw.bean.User;
import com.gjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("queryAllUser")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }

    @RequestMapping("queryUserByID/{id}")
    public User queryUserByID(@PathVariable("id") int id) {
        return userService.queryUserByID(id);
    }

    @RequestMapping("addUser")
    public int addUser() {
        return userService.addUser(new User(0, "AHuang", 155));
    }

    @RequestMapping("updateUser")
    public int updateUser() {
        return userService.updateUser(new User(7, "heiHEI", 5));
    }

    @RequestMapping("deleteUserByID/{id}")
    public int deleteUserByID(@PathVariable("id") int id) {
        return userService.deleteUserByID(id);
    }

}
