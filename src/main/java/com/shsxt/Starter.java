package com.shsxt;

import com.shsxt.config.MvcConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring-boot-crm 启动类
 *
 * @author Shawn
 * @date 2019-07-16 19:24
 */
@SpringBootApplication
@MapperScan("com.shsxt.crm.dao")
public class Starter {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Starter.class, MvcConfig.class);
        application.run();

    }

}
