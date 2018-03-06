package com.goudai.Test;

import com.goudai.domain.UserBean;
import com.goudai.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-mybatis.xml"})
public class TestClass {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        System.out.println(userService.getUserByName("hegoudai").toString());
    }

    @Test
    public void testInsert(){
        UserBean user = new UserBean();
        user.setPassword("1111111");
        user.setUsername("hegoudai2");
        userService.insertUser(user);
    }
}
