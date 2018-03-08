package com.goudai.proxy;

import com.goudai.advisor.AdvisorMethod;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AdvisorHandler implements InvocationHandler {
    private Object target;  //要代理的对象
    //构造函数
    public AdvisorHandler(Object target){
        this.target = target;
    }
    //负责拼接代码
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        AdvisorMethod.begin();
        method.invoke(target, args);
        return null;
    }
}
