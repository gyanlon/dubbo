package com.gyl.demo.rest.exception;

import com.gyl.demo.common.BaseException;
import com.gyl.demo.common.ResultCode;

public class DemoRestExcepton extends BaseException {
    public DemoRestExcepton(ResultCode resultCode) {
        super(resultCode);
    }
}
