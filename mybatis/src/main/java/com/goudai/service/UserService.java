package com.goudai.service;

import com.goudai.example.UserBean;
import com.goudai.mapper.UserMapper;
import com.goudai.tools.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserService {

    //新增用户
    @Test
    public void insertUser(){
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserBean user = new UserBean("hegoudai", "12346789");
        try{
            mapper.insertUser(user);
            System.out.println(user.toString());
            session.commit();
        }catch(Exception e){
            e.printStackTrace();
            session.rollback();
        }
    }
}
