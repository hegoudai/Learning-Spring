package com.goudai.proxy;

import com.goudai.service.MockService;
import com.goudai.service.Service;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void proxy(){
        //业务类（实现接口）
        Service target = new MockService();
        //编织代码类
        AdvisorHandler handler = new AdvisorHandler(target);

        //根据业务类和编织代码类返回代理对象
        Service proxy = (Service) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );

        proxy.doService();
    }
}
