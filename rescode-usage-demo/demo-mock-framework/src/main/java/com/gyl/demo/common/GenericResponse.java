package com.gyl.demo.common;

import lombok.Data;

@Data
public class GenericResponse<T> extends BaseResponse{



    /**
     * 返回结果
     */
    private T result;


    GenericResponse() {
    }

    public GenericResponse(ResultCode rc) {
//        type = rc.getType();
//        code = rc.getCode();
//        systemMsg = rc.getSystemMsg();
//        displayMsg = rc.getDisplayMsg();
    }

    public GenericResponse(T data, ResultCode rc) {
        this(rc);
        result = data;
    }
}