package com.spring;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lx
 * <p>
 * 动态代理 cglib
 * @date 2023-06-26
 */
public class TestMain5 {

    @Test
    public static void main(String[] args) {
        Worker doWork = new Worker("zhangsan");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Worker.class);

        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("帮忙吃饭");
                return method.invoke(doWork, objects);
            }
        };
        enhancer.setCallback(methodInterceptor);
        Worker workProxy = (Worker) enhancer.create();
        workProxy.work("李四");
    }
}

class Worker {

    private Child child;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Worker() {
    }

    public Worker(String name) {
        this.name = name;
    }

    public void work(String name1) {
        System.out.println(name + "在干活");
    }
}
