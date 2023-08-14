package com.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.JDBCType;

/**
 * @author lx
 * @date 2023-08-14
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@ComponentScan("com.spring")
public class TransactionConfig {

    /*配置链接池、数据源、事务管理器*/
    @Value("${jdbc_username}")
    private String username;
    @Value("${jdbc_password}")
    private String password;
    @Value("${jdbc_url}")
    private String url;
    @Value("${jdbc_driverClassName}")
    private String driver;

    @Bean
    public DruidDataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        return dataSource;
    }


    @Bean
    public JdbcTemplate getJdbcTemplate(DruidDataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager getTransactionManager(DruidDataSource dataSource){
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }

}
