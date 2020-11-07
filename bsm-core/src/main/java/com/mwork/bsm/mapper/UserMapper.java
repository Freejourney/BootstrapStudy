package com.mwork.bsm.mapper;

import com.mwork.bsm.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAllUsers();
}
