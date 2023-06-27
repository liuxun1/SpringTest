package com.spring;

import com.spring.config.SpringConfig;
import com.spring.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lx
 *
 * 静态代理
 * @date 2023-06-26
 */
public class TestMain3 {

    @Test
    public static void main(String[] args) {
        Teacher teacher = new Teacher("老师");
        Child child = new Child("小孩");
        teacher.setChild(child);
        teacher.work("小孩");
    }
}

interface Work{
    void work(String name);
}
class Teacher implements Work{

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

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void work(String name1) {
        child.work(name1);
        System.out.println(name + "在帮忙");
    }
}

class Child implements Work{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child() {
    }

    public Child(String name) {
        this.name = name;
    }

    @Override
    public void work(String name) {
        System.out.println(name + "在干活");
    }
}
