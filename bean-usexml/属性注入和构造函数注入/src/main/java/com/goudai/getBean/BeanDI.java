package com.goudai.getBean;

import com.goudai.bean.Car;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDI {
    private static ApplicationContext context = null;
    private static String[] CONFIG_FILES = {"bean.cfg.xml"};
    //测试前加载bean属性配置文件
    @BeforeClass
    public static void setUp() throws Exception{
        context = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }
    //属性注入
    @Test
    public void testAttrDI(){
        Car car = (Car)context.getBean("car");
        System.out.println("Brand: "+car.getBrand()+" MaxSpeed: "+car.getMaxSpeed());
    }
    //构造函数注入
    @Test
    public void testConstructorDI(){
        Car car = (Car)context.getBean("car1");
        System.out.println("Brand: "+car.getBrand()+" MaxSpeed: "+car.getMaxSpeed());
    }
}
