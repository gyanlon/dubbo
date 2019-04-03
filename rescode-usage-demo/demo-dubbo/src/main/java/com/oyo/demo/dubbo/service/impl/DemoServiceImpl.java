package com.oyo.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.oyo.demo.common.BaseException;
import com.oyo.demo.common.BaseResponse;
import com.oyo.demo.dubbo.service.DemoService;
import lombok.extern.slf4j.Slf4j;


@Service(version="1.0.0")
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Override
    public BaseResponse doSuccess() {

        return null;
    }

    @Override
    public BaseResponse doFail() {

        return null;
    }

    @Override
    public BaseResponse doException() {

        if( true ) {
            throw new BaseException("");
        }
        return null;
    }
}
