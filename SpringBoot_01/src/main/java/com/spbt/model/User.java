package com.spbt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lx
 * @date 2023-08-15
 */
@Component
@ConfigurationProperties(prefix = "user")  //Properties文件赋值，同时采用前缀映射，同时属性值要一致
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String uname;
    private Integer age;
}
