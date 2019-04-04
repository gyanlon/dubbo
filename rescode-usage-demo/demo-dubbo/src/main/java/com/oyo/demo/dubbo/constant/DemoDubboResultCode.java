package com.oyo.demo.dubbo.constant;

import com.oyo.demo.common.ResultCode;
import lombok.Getter;

import java.io.Serializable;

@Getter
public enum DemoDubboResultCode implements ResultCode {
    X_FAILURE("666666666", "X失败"),
    Y_FAILURE("777777777", "Y失败"),
    SUCCESS("888888888", "成功");

    private final String code;
    private final String msg;

    DemoDubboResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String toString() {
        return "(code=" + this.getCode() + ", msg=" + this.getMsg() + ", systemMsg=" + getSystemMsg()+ ", displayMsg=" + getDisplayMsg()+ ")";
    }
}
