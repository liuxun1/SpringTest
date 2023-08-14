package com.spring.service;

import com.spring.model.Dept;
import com.spring.model.Emp;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 *
 * 实现对属性初始化前后赋值操作
 * @author lx
 * @date 2023-06-26
 */
//@Service
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之前对属性设值");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之后对属性设值");
        if(beanName.equals("dept")){
            Dept dept = (Dept) bean;
            dept.setName("信息部");
            bean = dept;
        }

        if(beanName.equals("emp")){
            Emp emp = (Emp) bean;
            emp.setName("事业部");
            bean = emp;
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
