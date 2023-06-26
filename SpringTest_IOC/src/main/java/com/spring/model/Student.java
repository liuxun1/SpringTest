package com.spring.model;

import java.util.Date;

/**
 * @author lx
 * @date 2023-06-26
 */
public class Student {

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
