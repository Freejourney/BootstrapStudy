package com.mwork.bsm.service.impl;

import com.mwork.bsm.bean.User;
import com.mwork.bsm.mapper.UserMapper;
import com.mwork.bsm.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public List<com.mwork.bsm.domain.User> findAllUsers() {
        List<User> users = userMapper.findAllUsers();

        List<com.mwork.bsm.domain.User> outputUsers = new ArrayList<>();
        for (User user : users) {
            com.mwork.bsm.domain.User outputUser = new com.mwork.bsm.domain.User();
            outputUser.setUid(user.getUid());
            outputUser.setMobile(user.getMobile());
            outputUser.setEmail(user.getEmail());
            outputUser.setPassword(user.getPassword());
            outputUser.setUpdateDate(user.getUpdateDate());
            outputUser.setCreateDate(user.getCreateDate());

            outputUsers.add(outputUser);
        }

        return outputUsers;
    }

}
