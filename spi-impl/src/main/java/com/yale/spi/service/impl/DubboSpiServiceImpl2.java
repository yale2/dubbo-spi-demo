package com.yale.spi.service.impl;

import com.yale.spi.api.service.DubboSpiService;
import org.apache.dubbo.common.URL;

public class DubboSpiServiceImpl2 implements DubboSpiService {

    @Override
    public String sayHello() {
        return "hello ! this is dubbo spi service2";
    }

    @Override
    public String sayHello(URL url) {
        return "hello ! this is dubbo spi service2 using url";
    }
}
