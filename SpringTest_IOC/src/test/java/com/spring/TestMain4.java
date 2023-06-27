package com.spring;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lx
 * <p>
 * 动态代理 JDK
 * @date 2023-06-26
 */
public class TestMain4 {

    @Test
    public static void main(String[] args) {
        DoWork doWork = new Person("zhangsan");
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("李四在帮忙");
                //原本方法还是要原对象自己去调用,代理对象只是提供了一个调用入口
                return method.invoke(doWork, args);
            }
        };
        DoWork workProxy = (DoWork) Proxy.newProxyInstance(Person.class.getClassLoader(), Person.class.getInterfaces(), handler);
        workProxy.work("zhangsan");
    }
}

interface DoWork {
    void work(String name);
}

class Person implements DoWork {

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

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void work(String name1) {
        System.out.println(name + "在干活");
    }
}
