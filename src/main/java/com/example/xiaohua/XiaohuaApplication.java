package com.example.xiaohua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;



@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//直接写下面一行会报错
//@SpringBootApplication
public class XiaohuaApplication {

    public static void main(String[] args) {

        SpringApplication.run(XiaohuaApplication.class, args);
    }

}
