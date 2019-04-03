package com.oyo.demo.dubbo.service.impl;

import com.oyo.demo.common.ResultCode;
import lombok.Getter;

@Getter
public enum DemoDubboResultCode implements ResultCode {
    X_FAILURE("160013442", "X失败"),
    Y_FAILURE("260121122", "Y失败"),
    SUCCESS("360121123", "成功");

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
