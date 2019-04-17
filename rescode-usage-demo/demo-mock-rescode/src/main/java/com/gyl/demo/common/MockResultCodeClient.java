package com.gyl.demo.common;

/**
 * Mock Class for 码SDK
 */
public class MockResultCodeClient {

    public static String getDisplayMsg(String code) {

        for (MockResultCode rc : MockResultCode.values()) {

            if(rc.getCode().equals(code)) {
                return rc.getDisplayMsg();
            }

        }

        return code + "'s display message";
    }

    public static String getSystemMsg(String code) {
        for (MockResultCode rc : MockResultCode.values()) {

            if(rc.getCode().equals(code)) {
                return rc.getSystemMsg();
            }

        }

        return code + "'s system message";
    }

    public static int getType(String code) {
        for (MockResultCode rc : MockResultCode.values()) {

            if(rc.getCode().equals(code)) {
                return rc.getType();
            }

        }

        return 1;
    }
}
