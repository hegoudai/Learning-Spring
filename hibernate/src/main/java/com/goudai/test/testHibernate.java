package com.goudai.test;

import com.goudai.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext-hbt.xml")
public class testHibernate {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Test
    public void testGetUserById(){
        User user = hibernateTemplate.get(User.class, 26);
        System.out.println(" username: "+user.getUsername()+ " password:" +user.getPassword());
    }

    @Test
    @Transactional()
    @Rollback(false)  //使测试事务不回滚，在数据库中看到结果
    public void insert(){
        User user = new User();
        user.setUsername("hegoudai_byhbt");
        user.setPassword("12341234");
        hibernateTemplate.save(user);
    }

}
