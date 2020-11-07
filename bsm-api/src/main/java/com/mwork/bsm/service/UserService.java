package com.mwork.bsm.service;

import com.mwork.bsm.domain.User;

import java.util.List;

/**
 * @Author DongDawei
 * @createTime 2020/11/719:08
 */
public interface UserService {

    List<User> findAllUsers();

}
