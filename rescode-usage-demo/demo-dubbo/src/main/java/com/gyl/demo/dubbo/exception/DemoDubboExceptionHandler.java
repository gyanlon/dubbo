package com.gyl.demo.dubbo.exception;

import com.gyl.demo.common.BaseException;
import com.gyl.demo.common.GenericResponse;
import com.gyl.demo.dubbo.constant.DemoDubboResultCode;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class DemoDubboExceptionHandler {

    @Pointcut("within(com.gyl.demo.dubbo..*Service*)")
    public void servicePointCut() {
    }

    @Around("servicePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {

        try {
            Object result = point.proceed();
            return result;
        } catch (Exception e) {
            log.error("Handler Exception : ", e);
            Object response = handleException(e);
            log.info("Pack exception to response");
            return response;
        }
    }

    private Object handleException(Exception e) {
        GenericResponse genericResponse = new GenericResponse(DemoDubboResultCode.X_FAILURE);

        if (e instanceof BaseException) {
            genericResponse = new GenericResponse(((BaseException) e).getRc());
        }

        return genericResponse;
    }
}
