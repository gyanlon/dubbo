package com.oyo.demo.rest.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.oyo.demo.common.BaseResponse;
import com.oyo.demo.common.ResultCodeType;
import com.oyo.demo.dubbo.service.DemoService;
import com.oyo.demo.rest.constant.DemoRestResultCode;
import com.oyo.demo.rest.exception.DemoRestExcepton;
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
    public BaseResponse<List<String>> doSuccess() {
        BaseResponse result = null;

        BaseResponse demoRes = demoService.doSomething(1);
        result = process(demoRes);

        return result;
    }

    @GetMapping(value = "get/fail")
    public BaseResponse<List<String>> doFail() {
        BaseResponse result = null;

        BaseResponse demoRes = demoService.doSomething(2);
        result = process(demoRes);

        return result;
    }

    @GetMapping(value = "get/exception")
    public BaseResponse<List<String>> doException() {
        BaseResponse result = null;

        BaseResponse demoRes = demoService.doSomething(3);
        result = process(demoRes);

        return result;
    }

    private BaseResponse<List<String>> process(BaseResponse<Integer> res) {
        BaseResponse<List<String>> result = null;
        if (res.getType() == ResultCodeType.SUCCESS) {

            // put some result
            List<String> strList = new ArrayList<>();
            strList.add("a");
            strList.add("b");
            strList.add("c");

            result = new BaseResponse<List<String>>(strList, DemoRestResultCode.SUCCESS);

        } else {

            throw new DemoRestExcepton(DemoRestResultCode.Z_FAILURE);
        }
        return result;
    }

}
