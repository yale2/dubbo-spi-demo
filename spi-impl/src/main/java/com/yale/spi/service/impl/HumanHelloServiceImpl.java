package com.yale.spi.service.impl;

import com.yale.spi.api.service.HumanHelloService;

public class HumanHelloServiceImpl implements HumanHelloService {
    @Override
    public String sayHello() {
        return "hello 你好";
    }
}
