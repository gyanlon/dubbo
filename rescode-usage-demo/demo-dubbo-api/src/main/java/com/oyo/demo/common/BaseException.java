package com.oyo.demo.common;

import lombok.Getter;

/**
 * @author Ding
 * @description
 * @date 2019-02-03
 */
@Getter
public class BaseException extends RuntimeException {
    public BaseException(String msg) {
        super(msg);
    }
}
