package com.mwork.bsm.controller;

import com.mwork.bsm.domain.User;
import com.mwork.bsm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUsers")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }
}
