package com.oyo.demo.common;

import lombok.Data;

@Data
public class BaseResponse<T> {

    /**
     * 状态码 （0：成功； 1；错误）
     */
    private int status = 0;

    /**
     * 业务状态码
     */
    private String code;

    /**
     * 返回说明
     */
    private String message;

    /**
     * 返回结果
     */
    private T result;


    public BaseResponse() { }


    public BaseResponse(int status) {
        this.status = status;
    }

    public BaseResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResponse(int status, T result) {
        this.status = status;
        this.result = result;
    }

    public BaseResponse(int status, String message, T result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }
}