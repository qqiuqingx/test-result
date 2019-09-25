package com.zian.testresult.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {
    public HelloSpringApplicationRunListener(SpringApplication application, String[] args) {

    }

    @Override
    public void starting() {
        System.err.println("run方法运行回调statring方法。。。。。。。。。。。");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.err.println("环境准备搞调用environmentPrepared(),环境信息"+environment);
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.err.println(" prepareContext(context, environment, listeners, applicationArguments, printedBanner);回调contextPrepared 上下文为："+context);
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.err.println("prepareContext(context, environment, listeners, applicationArguments, printedBanner)执行完毕回调contextLoaded（）");
    }

    @Override
    public void finished(ConfigurableApplicationContext context, Throwable exception) {
        System.err.println("RUN方法执行完毕调用finished()方法");
    }
}
