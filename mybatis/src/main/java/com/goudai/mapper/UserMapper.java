package com.goudai.mapper;

import com.goudai.example.UserBean;

import java.util.List;

public interface UserMapper {
    //新增用户
    public int insertUser(UserBean user) throws Exception;
    //修改用户
    public int updateUser(UserBean user, int id) throws Exception;
    //删除用户
    public int deleteUser(int id) throws Exception;
    //根据id查询用户信息
    public UserBean getUserById(int id) throws Exception;
    //查询所有用户信息
    public List<UserBean> selectAllUser() throws Exception;
}
