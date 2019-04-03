package com.oyo.demo.dubbo.service;

import com.oyo.demo.common.BaseResponse;

public interface DemoService {

    BaseResponse doSuccess();
    BaseResponse doFail();
    BaseResponse doException();
}
