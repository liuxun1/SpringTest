package com.spbt.config;

import com.spbt.model.LoanMgmJoin;
import com.spbt.model.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author lx
 * @date 2023-08-15
 */
@Configuration
@Import({LoanMgmJoin.class, User.class})
@ConditionalOnProperty(name = "aaa.b", havingValue = "x")
@EnableConfigurationProperties
public class MyConfig {

    @Bean("join1")
    public LoanMgmJoin getJoin1(){
        LoanMgmJoin join = new LoanMgmJoin();
        join.setActivityType(1);
        return join;
    }

    @Bean("join2")
    public LoanMgmJoin getJoin2(){
        LoanMgmJoin join = new LoanMgmJoin();
        join.setActivityType(2);
        return join;
    }

}
