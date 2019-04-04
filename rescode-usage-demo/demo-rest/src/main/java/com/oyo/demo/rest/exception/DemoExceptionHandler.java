package com.oyo.demo.rest.exception;

import com.oyo.demo.common.BaseException;
import com.oyo.demo.common.BaseResponse;
import com.oyo.demo.rest.constant.DemoRestResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class DemoExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object exception(Exception e) {
        BaseResponse baseResponse = null;

        log.error("DemoRest ERROR", e);
        if (e instanceof BaseException) {
            baseResponse = new BaseResponse(((BaseException) e).getRc());
        } else {
            baseResponse = new BaseResponse(DemoRestResultCode.Z_FAILURE);
        }

        return baseResponse;
    }
}
