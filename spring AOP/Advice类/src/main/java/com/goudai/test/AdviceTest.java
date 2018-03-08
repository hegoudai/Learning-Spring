package com.goudai.test;

import com.goudai.advices.AfterAdvice;
import com.goudai.advices.BeforeAdvice;
import com.goudai.advices.ExceptionAdvice;
import com.goudai.advices.SurroundAdvice;
import com.goudai.service.MockService;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class AdviceTest {

    @Test
    public void testBeforeAdvice(){
        MockService service = new MockService();
        BeforeAdvice beforeAdvice = new BeforeAdvice();

        //工厂代理方式
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(service);
        pf.addAdvice(beforeAdvice);

        //生成实例
        MockService proxy = (MockService)pf.getProxy();
        proxy.doService();
    }

    @Test
    public void testAfterAdvice(){
        MockService service = new MockService();
        AfterAdvice afterAdvice = new AfterAdvice();

        //工厂代理方式
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(service);
        pf.addAdvice(afterAdvice);

        //生成实例
        MockService proxy = (MockService)pf.getProxy();
        proxy.doService();
    }

    @Test
    public void testSurroundAdvice(){
        MockService service = new MockService();
        SurroundAdvice surroundAdvice = new SurroundAdvice();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(service);
        pf.addAdvice(surroundAdvice);

        MockService proxy = (MockService)pf.getProxy();
        proxy.doService();
    }

    @Test
    public void testExceptionAdvice(){
        MockService service = new MockService();
        ExceptionAdvice exAdvice = new ExceptionAdvice();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(service);
        pf.addAdvice(exAdvice);

        MockService proxy = (MockService)pf.getProxy();
        proxy.doService();
        try {
            proxy.throwException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
