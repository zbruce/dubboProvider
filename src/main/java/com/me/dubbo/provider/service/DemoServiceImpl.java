package com.me.dubbo.provider.service;

import com.me.dubbo.api.service.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String s) {
        return "hello " + s ;
    }
}
