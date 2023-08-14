package com.spring.config;

import org.springframework.context.annotation.*;

/**
 * @author lx
 * @date 2023-06-27
 */
@ComponentScan("com.spring")
@PropertySource(value = "classpath:baseConfig.properties")
@Configuration
//@ImportResource(value = "classpath:applicationContext_annotation.xml") 读取xml配置的注解
//@EnableAspectJAutoProxy  //启用动态代理
public class SpringConfig {

}