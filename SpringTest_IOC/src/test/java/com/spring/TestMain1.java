package com.spring;

import com.alibaba.druid.pool.DruidDataSource;
import com.spring.model.Book;
import com.spring.model.Dept;
import com.spring.model.Emp;
import com.spring.model.Student;
import com.spring.service.BookFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lx
 * 测试 XML方式实现 IOC & DI
 * @date 2023-06-26
 */
public class TestMain1 {

    @Test
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Dept dept = ac.getBean("dept", Dept.class);
        System.out.println(dept);
    }
}
