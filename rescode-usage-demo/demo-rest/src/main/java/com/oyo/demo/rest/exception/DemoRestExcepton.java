package com.oyo.demo.rest.exception;

import com.oyo.demo.common.BaseException;
import com.oyo.demo.common.ResultCode;

public class DemoRestExcepton extends BaseException {
    public DemoRestExcepton(ResultCode resultCode) {
        super(resultCode);
    }
}
