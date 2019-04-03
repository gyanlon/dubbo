package com.oyo.demo.rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {

    /**
     * 监控调用，检查服务状态
     */
     @GetMapping(value = "/ping")
    public String ping() {
        return "pong";
    }

}
