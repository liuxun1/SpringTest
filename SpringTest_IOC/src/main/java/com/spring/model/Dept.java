package com.spring.model;

/**
 * @author lx
 * @date 2023-06-26
 */
public class Dept {

    private String name;
    private Emp emp;

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                ", emp=" + emp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 设置属性值");
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Dept(String name, Emp emp) {
        this.name = name;
        this.emp = emp;
    }

    public Dept() {
        System.out.println("第三步 初始化bean");
    }

    public void initMethod(){
        System.out.println("第一步 初始化");
    }

    public void destoryMethod(){
        System.out.println("第五步 销毁");
    }
}
