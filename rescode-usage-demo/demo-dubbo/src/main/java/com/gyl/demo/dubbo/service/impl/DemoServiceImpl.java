package com.gyl.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gyl.demo.common.BaseException;
import com.gyl.demo.common.GenericResponse;
import com.gyl.demo.dubbo.constant.DemoDubboResultCode;
import com.gyl.demo.dubbo.service.DemoService;
import lombok.extern.slf4j.Slf4j;


@Service(version = "1.0.0")
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Override
    public GenericResponse<Integer> doSomething(int i) {

        GenericResponse<Integer> result = null;

        // success
        if( i == 1) {
            result = new GenericResponse(1, DemoDubboResultCode.SUCCESS);
        }
        // fail
        else if( i == 2) {
            result = new GenericResponse(DemoDubboResultCode.X_FAILURE);
        }
        // exception
        else {
            throw new BaseException(DemoDubboResultCode.Y_FAILURE);
        }

        return result;
    }
}
