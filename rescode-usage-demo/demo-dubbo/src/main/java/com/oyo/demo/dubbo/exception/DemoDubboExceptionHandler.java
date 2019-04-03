package com.oyo.demo.dubbo.exception;

import com.oyo.demo.common.BaseException;
import com.oyo.demo.common.BaseResponse;
import com.oyo.demo.dubbo.constant.DemoDubboResultCode;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 对外RPC接口全局异常处理类
 *
 * @author Ding
 * @description
 * @date 2019-02-03
 */
@Slf4j
@Aspect
@Component
public class DemoDubboExceptionHandler {

    @Pointcut("@within(com.oyo.demo.dubbo.DemoService)")
    public void logPointCut() {
    }
    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        try {
            Object result = point.proceed();
            return result;
        } catch (Exception e) {
            log.error("biz service error", e);
            return handleException(e);
        }
    }

    /**
     * 处理异常
     *
     * @param e
     * @return
     */
    private Object handleException(Exception e) {
        BaseResponse baseResponse = new BaseResponse(DemoDubboResultCode.X_FAILURE);

        if (e instanceof BaseException) {
            baseResponse = new BaseResponse(((BaseException) e).getRc());
        }

        return baseResponse;
    }
}
