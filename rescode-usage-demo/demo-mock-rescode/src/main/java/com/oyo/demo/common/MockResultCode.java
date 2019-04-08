package com.oyo.demo.common;

import lombok.Getter;

@Getter
public enum MockResultCode implements ResultCode {
    D1("666666666", ResultCodeType.UNKOWN, "D1失败", "D1文案"),
    D2("777777777", ResultCodeType.FAIL, "D2失败", "D2文案"),
    D3("888888888", ResultCodeType.SUCCESS, "D3成功", "D3成功文案"),

    R1("111111111", ResultCodeType.UNKOWN, "X失败", "R1失败文案"),
    R2("222222222", ResultCodeType.FAIL, "X失败", "R2失败文案"),
    R3("333333333", ResultCodeType.FAIL, "X失败", "R3失败文案"),
    R4("444444444", ResultCodeType.SUCCESS, "成功", "R4成功文案");

    private final String code;
    private final int type;
    private final String systemMsg;
    private final String displayMsg;

    MockResultCode(String code, int type, String systemMsg, String displayMsg) {
        this.code = code;
        this.type = type;
        this.systemMsg = systemMsg;
        this.displayMsg = displayMsg;
    }
}
