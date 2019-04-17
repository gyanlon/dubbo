package com.gyl.demo.rest.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.gyl.demo.common.GenericResponse;
import com.gyl.demo.common.ResultCodeType;
import com.gyl.demo.dubbo.service.DemoService;
import com.gyl.demo.rest.constant.DemoRestResultCode;
import com.gyl.demo.rest.exception.DemoRestExcepton;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "demo")
@Slf4j
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping(value = "get/success")
    public GenericResponse<List<String>> doSuccess() {
        GenericResponse result = null;

        GenericResponse demoRes = demoService.doSomething(1);
        result = process(demoRes);

        return result;
    }

    @GetMapping(value = "get/fail")
    public GenericResponse<List<String>> doFail() {
        GenericResponse result = null;

        GenericResponse demoRes = demoService.doSomething(2);
        result = process(demoRes);

        return result;
    }

    @GetMapping(value = "get/exception")
    public GenericResponse<List<String>> doException() {
        GenericResponse result = null;

        GenericResponse demoRes = demoService.doSomething(3);
        result = process(demoRes);

        return result;
    }

    private GenericResponse<List<String>> process(GenericResponse<Integer> res) {
        GenericResponse<List<String>> result = null;
        if (res.getType() == ResultCodeType.SUCCESS) {

            // put some result
            List<String> strList = new ArrayList<>();
            strList.add("a");
            strList.add("b");
            strList.add("c");

            result = new GenericResponse<List<String>>(strList, DemoRestResultCode.SUCCESS);

        } else {

            log.error(res.toString());
            throw new DemoRestExcepton(DemoRestResultCode.Z_FAILURE);
        }
        return result;
    }

}
