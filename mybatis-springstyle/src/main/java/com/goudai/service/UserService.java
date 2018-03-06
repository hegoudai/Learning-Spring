package com.goudai.service;

import com.goudai.domain.UserBean;
import com.goudai.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    @Autowired
    private UserMapper userMapper;

    public UserBean getUserByName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    public int insertUser(UserBean user){
        return userMapper.insertUser(user);
    }
}
