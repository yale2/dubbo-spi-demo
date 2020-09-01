package com.yale.spi.test;

import com.yale.spi.api.service.DubboSpiService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.*;

/**
 * @author yale
 */
public class TestDubboSpi {

    public static void main(String[] args) {
        //普通的service
        ExtensionLoader<DubboSpiService> extensionLoader=ExtensionLoader.getExtensionLoader(DubboSpiService.class);
        Set<String> supportedExtensions = extensionLoader.getSupportedExtensions();
        for (String loadedExtension : supportedExtensions) {
            System.out.println(extensionLoader.getExtension(loadedExtension).sayHello());
        }

        //带有url的service dubbo自动将第一个大写字母以.分割  DubboSpiService 分割为dubbo.spiService
        URL url= URL.valueOf("test://localhost/dubbo?dubbo.spiService=spi");
        DubboSpiService adaptiveExtension = extensionLoader.getAdaptiveExtension();
        System.out.println(adaptiveExtension.sayHello(url));


    }
}
