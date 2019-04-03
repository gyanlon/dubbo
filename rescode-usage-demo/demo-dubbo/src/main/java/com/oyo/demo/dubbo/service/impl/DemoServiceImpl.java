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
    public BaseResponse doSuccess() {

        // Do something

        return new BaseResponse(DemoDubboResultCode.SUCCESS);
    }

    @Override
    public BaseResponse doFail() {

        // Do something

        return new BaseResponse(DemoDubboResultCode.Y_FAILURE);
    }

    @Override
    public BaseResponse doException() {

        // Do something

        if (true) {
            throw new BaseException(DemoDubboResultCode.X_FAILURE);
        }
        return new BaseResponse(DemoDubboResultCode.Y_FAILURE);
    }
}
