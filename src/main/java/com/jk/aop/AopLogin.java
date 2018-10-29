package com.jk.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopLogin {

    @Pointcut("execution(public * com.jk.controller.*.*(..))")
    private void doBenfore(){

    }
    @Before("doBenfore()")
    private  void   doBefore(JoinPoint joinPoint){
        System.out.println("进入:前置通知");
    }
}
