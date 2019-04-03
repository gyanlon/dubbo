package com.oyo.demo.rest;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.oyo.demo")
@EnableDubboConfig
@EnableDubbo
@SpringBootApplication
@Slf4j
public class DemoRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoRestApplication.class, args);
    }
}
