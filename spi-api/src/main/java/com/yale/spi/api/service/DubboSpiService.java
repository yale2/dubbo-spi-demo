package com.yale.spi.api.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("spi")
public interface DubboSpiService {

    String sayHello();

    @Adaptive
    String sayHello(URL url);
}
