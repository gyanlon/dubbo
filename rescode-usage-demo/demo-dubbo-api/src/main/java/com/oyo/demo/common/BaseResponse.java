package com.oyo.demo.common;

import lombok.Data;

@Data
public class BaseResponse<T> {

    /**
     * 状态码 （0: 未知； 1：成功； 2；错误）
     */
    private int status = 0;

    /**
     * 业务状态码
     */
    private String code;

    /**
     * 返回说明
     */
    private String systemMsg;

    /**
     * 显示文案
     */
    private String displayMsg;

    /**
     * 返回结果
     */
    private T result;


    public BaseResponse(T data, ResultCode rc) {
        result = data;
        init(rc);
    }

    public BaseResponse(ResultCode rc) {
        init(rc);
    }

    private void init(ResultCode rc) {
        code = rc.getCode();
        systemMsg = rc.getSystemMsg();
        displayMsg = rc.getDisplayMsg();
        status = rc.getType();
    }
}