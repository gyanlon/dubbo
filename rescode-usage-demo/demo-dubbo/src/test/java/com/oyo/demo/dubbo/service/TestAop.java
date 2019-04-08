package com.oyo.demo.dubbo.service;

import com.oyo.demo.dubbo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = com.oyo.demo.dubbo.DemoDubboApplication.class)
public class TestAop {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DemoService demoServiceImpl;

    @Test
    public void invokeAOPStuff() {
        demoServiceImpl.doSomething(3);
    }
}
