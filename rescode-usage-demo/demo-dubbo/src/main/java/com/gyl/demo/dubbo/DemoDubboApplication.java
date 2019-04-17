package com.gyl.demo.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.oyo.demo")
@EnableDubboConfig
@EnableDubbo(scanBasePackages = "com.oyo.demo.dubbo.service.impl")
@SpringBootApplication
@Slf4j
public class DemoDubboApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoDubboApplication.class, args);
    }
}

