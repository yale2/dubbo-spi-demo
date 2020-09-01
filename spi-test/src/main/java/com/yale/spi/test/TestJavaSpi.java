package com.yale.spi.test;

import com.yale.spi.api.service.HumanHelloService;

import java.util.ServiceLoader;

/**
 * @author yale
 */
public class TestJavaSpi {

    public static void main(String[] args) {
        ServiceLoader<HumanHelloService> helloServices = ServiceLoader.load(HumanHelloService.class);
        for (HumanHelloService helloService : helloServices) {
            System.out.println(helloService.sayHello());
        }
    }
}
