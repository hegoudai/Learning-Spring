package com.goudai.getFactorybean;

import com.goudai.bean.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/FactoryDI.cfg.xml")
public class TestGetFactoryBean {
    @Autowired
    public ApplicationContext context;

    @Test
    public void test(){
        Car car = (Car)context.getBean("car");
        System.out.println("brand: "+car.getBrand()+" maxSpeed: "+car.getMaxSpeed());
    }
}
