package com.gyl.demo.common;

public interface ResultCode {
    String getCode();

    default public int getType() {
        return MockResultCodeClient.getType(getCode());
    }

    default public String getSystemMsg() {
        return MockResultCodeClient.getSystemMsg(getCode());
    }

    default String getDisplayMsg() {
        return MockResultCodeClient.getDisplayMsg(getCode());
    }
}
