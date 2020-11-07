package com.mwork.bsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.mwork.bsm.mapper")
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
