package com.goudai.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SurroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before advice begin...");
        Object re = methodInvocation.proceed();
        System.out.println("after advice begin...");
        return re;
    }
}
