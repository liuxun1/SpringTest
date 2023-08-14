package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 采用 XML方式生效
 * @author lx
 * @date 2023-07-01
 */
//@Component
@Aspect
@Order(1) //数字越小优先级越高 多个切面类则生成多个代理，嵌套执行
public class Aspect3Config {


    public void methodPointcut() {

    }

    // joinpoint实质上是切面方法的信息，可以获取到对应方法的一些属性信息
    public void methodBefore(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Object proxyObj = joinPoint.getThis();
        Object targetObj = joinPoint.getTarget();

        //System.out.println(args[0] + "-" + args[1]);
        System.out.println("前置通知3。。。");
    }

    public void methodAfter(JoinPoint joinPoint) {
        System.out.println("后置通知3。。。");
    }


    /**
     *
     * ProceedingJoinPoint 是JoinPoint的子接口,这个对象只能作用于around上
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    public Object methodAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundA 通知3");
        Object proceed = pjp.proceed();
        System.out.println("aroundB 通知3");
        return proceed;
    }

    public void methodAfterThrow(Exception ex) throws Throwable {
        System.out.println("异常通知3");
    }

    public void methodAfterReturn(JoinPoint joinPoint, Object ret) throws Throwable {
        System.out.println("AfterReturn 通知并返回值3");
    }
}
