package com.gyl.demo.dubbo.service;

import com.gyl.demo.common.GenericResponse;

public interface DemoService {

    GenericResponse<Integer> doSomething(int i);
}
