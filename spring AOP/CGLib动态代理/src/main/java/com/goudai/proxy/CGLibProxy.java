package com.goudai.proxy;

import com.goudai.advisor.AdvisorMethod;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    //根据传进的类创建子类实例
    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    //编织代码
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        AdvisorMethod.begin();  //advisor
        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }
}
