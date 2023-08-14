package com.spring;

import com.spring.config.SpringConfig;
import com.spring.service.StudentService;
import com.spring.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author lx
 * <p>
 * 动态代理 cglib
 * @date 2023-06-26
 */
public class TestMain_AOP {

    @Test
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_AOP.xml");
        StudentService bean = ac.getBean(StudentService.class);
        bean.addStudent("张三", new Date());

        /*ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentService bean = ac.getBean(StudentService.class);
        bean.addStudent("张三", new Date());*/
    }
}

