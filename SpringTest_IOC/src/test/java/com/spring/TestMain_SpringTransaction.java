package com.spring;

import com.spring.config.TransactionConfig;
import com.spring.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lx
 * @date 2023-06-26
 */
public class TestMain_SpringTransaction {

    @Test
    public static void main(String[] args) {
        //读取xml配置文件方式获取容器内bean
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_SpringTransaction.xml");
        StudentService bean = ac.getBean(StudentService.class);
        int result = bean.transMoney(45L, 46L, 2000L);
        System.out.println(result);*/

        //读取配置类方式获取容器内bean
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TransactionConfig.class);
        StudentService bean = ac.getBean(StudentService.class);
        int result = bean.transMoney(45L, 46L, 2000L);
        System.out.println(result);
    }
}

