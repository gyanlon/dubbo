package com.gyl.demo.common;

import java.io.Serializable;

public interface ResultCode extends Serializable {
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
