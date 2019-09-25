package com.zian.testresult.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

public class HelloApplicationContextListener implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.err.println("ApplicationContextInitializer的initialize（）方法执行了。。。。。传入的IOC容器："+applicationContext);
    }
}
