package com.gyl.demo.rest.exception;

import com.gyl.demo.common.BaseException;
import com.gyl.demo.common.GenericResponse;
import com.gyl.demo.rest.constant.DemoRestResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class DemoRestExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object exception(Exception e) {
        GenericResponse genericResponse = null;

        log.error("DemoRest ERROR", e);
        if (e instanceof BaseException) {
            genericResponse = new GenericResponse(((BaseException) e).getRc());
        } else {
            genericResponse = new GenericResponse(DemoRestResultCode.Z_FAILURE);
        }

        return genericResponse;
    }
}
