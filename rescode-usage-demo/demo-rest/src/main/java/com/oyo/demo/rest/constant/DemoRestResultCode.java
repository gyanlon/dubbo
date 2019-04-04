package com.oyo.demo.rest.constant;

import com.oyo.demo.common.ResultCode;
import lombok.Getter;

@Getter
public enum DemoRestResultCode implements ResultCode {
    X_FAILURE("111111111", "X失败"),
    Y_FAILURE("222222222", "Y失败"),
    Z_FAILURE("333333333", "Z失败"),
    SUCCESS("444444444", "成功");

    private final String code;
    private final String msg;

    DemoRestResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String toString() {
        return "(code=" + this.getCode() + ", msg=" + this.getMsg() + ", systemMsg=" + getSystemMsg()+ ", displayMsg=" + getDisplayMsg()+ ")";
    }
}
