package com.oyo.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.oyo.demo.common.BaseException;
import com.oyo.demo.common.BaseResponse;
import com.oyo.demo.dubbo.constant.DemoDubboResultCode;
import com.oyo.demo.dubbo.service.DemoService;
import lombok.extern.slf4j.Slf4j;


@Service(version = "1.0.0")
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Override
    public BaseResponse<Integer> doSomething(int i) {

        BaseResponse<Integer> result = null;

        // success
        if( i == 1) {
            result = new BaseResponse(1, DemoDubboResultCode.SUCCESS);
        }
        // fail
        else if( i == 2) {
            result = new BaseResponse(DemoDubboResultCode.X_FAILURE);
        }
        // exception
        else {
            throw new BaseException(DemoDubboResultCode.Y_FAILURE);
        }

        return result;
    }
}
