package com.oyo.demo.rest.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.oyo.demo.common.BaseException;
import com.oyo.demo.common.BaseResponse;
import com.oyo.demo.dubbo.service.DemoService;
import com.oyo.demo.rest.constant.DemoResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "demo")
@Slf4j
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping(value = "get")
    public BaseResponse doSomething(@RequestParam(value = "id") Long id) {
        BaseResponse result = null;//new BaseResponse();

        if (id == 1) {
            BaseResponse res = demoService.doSuccess();

            // Do Something to get data.
            Integer data = 1;

            // Populate the result
            result = new BaseResponse<Integer>(data, DemoResultCode.SUCCESS);

        } else if (id == 2) {

            BaseResponse res = demoService.doFail();
            result = new BaseResponse(DemoResultCode.X_FAILURE);

        } else {

            throw new BaseException(DemoResultCode.Y_FAILURE);
        }

        return result;
    }

}
