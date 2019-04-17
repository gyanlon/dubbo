package com.gyl.demo.common;

import lombok.Getter;

import java.io.Serializable;

/**
 * @author Ding
 * @description
 * @date 2019-02-03
 */
@Getter
public class BaseException extends RuntimeException implements Serializable {
    private String code;
    private String systemMsg;
    private String displayMsg;
    private ResultCode rc;

    BaseException() {
    }

    public BaseException(ResultCode resultCode) {
        super(resultCode.getDisplayMsg());

        code = resultCode.getCode();
        systemMsg = resultCode.getSystemMsg();
        displayMsg = resultCode.getDisplayMsg();
        rc = resultCode;
    }
}
