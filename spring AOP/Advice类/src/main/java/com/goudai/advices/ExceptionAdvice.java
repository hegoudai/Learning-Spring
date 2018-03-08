package com.goudai.advices;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ExceptionAdvice implements ThrowsAdvice{
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable{
        System.out.println("exception advice begin");
    }

}
