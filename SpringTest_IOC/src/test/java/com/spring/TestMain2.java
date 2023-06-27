package com.spring;

import com.spring.config.SpringConfig;
import com.spring.model.Dept;
import com.spring.model.Student;
import com.spring.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lx
 *
 * 测试 注解方式实现 IOC & DI
 * @date 2023-06-26
 */
public class TestMain2 {

    @Test
    public static void main(String[] args) {
        //通过读取xml文件的方式来获取bean对象
        //ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
       /* StudentService ss = ac.getBean("studentServiceImpl", StudentService.class);
        ss.addStudent();*/

        //通过读取配置类的方式来获取bean对象
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = ac.getBean("student", Student.class);
        System.out.println(student);
    }
}
