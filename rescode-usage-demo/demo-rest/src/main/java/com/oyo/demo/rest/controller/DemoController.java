package com.oyo.demo.rest.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.oyo.demo.common.BaseException;
import com.oyo.demo.common.BaseResponse;
import com.oyo.demo.dubbo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "demo")
@Slf4j
public class DemoController {

    @Reference(version="1.0.0")
    private DemoService demoService;

    @GetMapping(value = "get")
    public BaseResponse doSomething(@RequestParam(value = "id") Long id) {
        BaseResponse result = null;//new BaseResponse();

        if (id == 1) {
            demoService.doSuccess();
            result = new BaseResponse();
        } else if (id == 2) {
            demoService.doFail();
        } else {
            throw new BaseException("");
        }

        return result;
    }

}
