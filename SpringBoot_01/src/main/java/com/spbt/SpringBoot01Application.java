package com.spbt;

import com.spbt.config.MyConfig;
import com.spbt.model.LoanMgmJoin;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.spbt.mapper")
public class SpringBoot01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBoot01Application.class, args);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String s :definitionNames){
            System.out.println(s);
        }

        System.out.println(applicationContext.getBean("user"));

        /*System.out.println(applicationContext.getBean("join1"));
        System.out.println(applicationContext.getBean("join2"));
        LoanMgmJoin usera = applicationContext.getBean(MyConfig.class).getJoin1();
        LoanMgmJoin userb = applicationContext.getBean(MyConfig.class).getJoin1();
        System.out.println(usera==userb); //单例*/
    }

}
