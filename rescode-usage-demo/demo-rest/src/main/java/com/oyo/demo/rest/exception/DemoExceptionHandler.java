package com.oyo.demo.rest.exception;

import com.oyo.demo.common.BaseException;
import com.oyo.demo.common.BaseResponse;
import com.oyo.demo.rest.constant.DemoResultCode;
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
        BaseResponse baseResponse = new BaseResponse(DemoResultCode.X_FAILURE);

        if (e instanceof BaseException) {
            baseResponse = new BaseResponse(((BaseException) e).getRc());
        }

        return baseResponse;
    }
}
