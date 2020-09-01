package com.yale.spi.service.impl;


import com.yale.spi.api.service.DubboSpiService;
import org.apache.dubbo.common.URL;

/**
 * @author yale
 */
public class DubboSpiServiceImpl implements DubboSpiService {
    @Override
    public String sayHello() {
        return "hello ! this is dubbo spi service";
    }

    @Override
    public String sayHello(URL url) {
        return "hello ! this is dubbo spi service using url";
    }
}
