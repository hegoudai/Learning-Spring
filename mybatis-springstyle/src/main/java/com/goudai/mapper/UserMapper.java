package com.goudai.mapper;

import com.goudai.domain.UserBean;

import java.util.List;

public interface UserMapper {
    //新增用户
    int insertUser(UserBean user);
    //修改用户
    int updateUser(UserBean user, int id);
    //删除用户
    int deleteUser(int id);
    //根据id查询用户信息
    UserBean getUserById(int id);
    //根据username查询用户信息
    UserBean getUserByUserName(String username);
    //查询所有用户信息
    List<UserBean> selectAllUser();
}
