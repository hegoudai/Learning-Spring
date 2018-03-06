package com.goudai.mapper;

import com.goudai.example.UserBean;

import java.util.List;

public interface UserMapper {
    //新增用户
    int insertUser(UserBean user) throws Exception;
    //修改用户
    int updateUser(UserBean user, int id) throws Exception;
    //删除用户
    int deleteUser(int id) throws Exception;
    //根据id查询用户信息
    UserBean getUserById(int id) throws Exception;
    //查询所有用户信息
    List<UserBean> selectAllUser() throws Exception;
}
