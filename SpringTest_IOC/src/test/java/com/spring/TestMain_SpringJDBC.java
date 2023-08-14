package com.spring;

import com.spring.model.LoanMgmJoin;
import com.spring.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author lx
 * <p>
 * 动态代理 cglib
 * @date 2023-06-26
 */
public class TestMain_SpringJDBC {

    @Test
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_SpringJDBC.xml");
        StudentService bean = ac.getBean(StudentService.class);
        /*LoanMgmJoin mgmJoin = bean.selectById(1L);
        System.out.println(mgmJoin);*/

        /*List<LoanMgmJoin> joins = bean.selectAll();
        joins.forEach(System.out::println);*/

        /*int result = bean.addJoin(1L, 1, 1, "1", 1L, 1L);
        System.out.println(result);*/

        /*int result = bean.updateJoin(45L, 2023);
        System.out.println(result);*/

        /*int result = bean.deleteJoin(45L);
        System.out.println(result);*/

        /*ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentService bean = ac.getBean(StudentService.class);
        bean.addStudent("张三", new Date());*/
    }
}

