package com.zian.testresult.listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("web应用启动");
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("web项目销毁");
    }
}
