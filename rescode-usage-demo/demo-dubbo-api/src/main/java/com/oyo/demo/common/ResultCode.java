package com.oyo.demo.common;

public interface ResultCode {
    String getCode();

    default public int getType() {
        return ResultCodeClient.getType(getCode());
    }

    default public String getSystemMsg() {
        return ResultCodeClient.getSystemMsg(getCode());
    }

    default String getDisplayMsg() {
        return ResultCodeClient.getSystemMsg(getCode());
    }

}
