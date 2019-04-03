package com.oyo.demo.rest.constant;

import com.oyo.demo.common.ResultCode;
import lombok.Getter;

@Getter
public enum DemoResultCode implements ResultCode {
    X_FAILURE("460013442", "X失败"),
    Y_FAILURE("460121122", "Y失败"),
    SUCCESS("460121123", "成功");

    private final String code;
    private final String msg;

    DemoResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String toString() {
        return "(code=" + this.getCode() + ", msg=" + this.getMsg() + ", systemMsg=" + getSystemMsg()+ ", displayMsg=" + getDisplayMsg()+ ")";
    }
}
