package com.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author lx
 * @date 2023-06-26
 */
//@Service("student1") //不设置bean名称  默认的话是类名首字母小写
//@Service
@Component
public class Student {

    //@Value("张三")
    @Value("${name}")
    private String name;

    private Date birthday;

    public Student() {
        System.out.println("noneArg");
    }

    public Student(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
        System.out.println("allArg");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
