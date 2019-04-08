package com.oyo.demo.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {

//    /**
//     * 状态码 （0：成功； 1；失败）
//     */
//    private int status = 0;

    private int type;

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


    BaseResponse() {
    }

    public BaseResponse(ResultCode rc) {
        type = rc.getType();
        code = rc.getCode();
        systemMsg = rc.getSystemMsg();
        displayMsg = rc.getDisplayMsg();
    }

    public BaseResponse(T data, ResultCode rc) {
        this(rc);
        result = data;
    }
}