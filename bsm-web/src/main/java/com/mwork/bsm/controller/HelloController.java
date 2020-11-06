package com.mwork.bsm.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author DongDawei
 * @createTime 2020/11/616:39
 */
@RestController
@SpringBootApplication
public class HelloController {

    @RequestMapping("/")
    String index() {
        return "a springboot application";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
