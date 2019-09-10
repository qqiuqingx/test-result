package com.zian.testresult.config;






import com.zian.testresult.localetest.LoginHandlerIn;
import com.zian.testresult.localetest.MyLocalesolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
//@EnableWebMvc   不要接管SpringMVC
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // super.addViewControllers(registry);
        //浏览器发送 /atguigu 请求来到 success
       registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login.html").setViewName("index");
        registry.addViewController("/main").setViewName("dashboard");

    }

    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
               // registry.addViewController("/index.html").setViewName("index");
            }

            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //super.addInterceptors(registry);
                //静态资源；  *.css , *.js
                //SpringBoot已经做好了静态资源映射，所以我们不需要管
                //addpathPatterns()增加拦截的路径
               registry.addInterceptor(new LoginHandlerIn()).addPathPatterns("/**")
                       //排除的路径
                       .excludePathPatterns("/index.html","/index","/login");
            }
        };
        return adapter;
    }

    @Bean
    public LocaleResolver localeResolver(){
        System.out.println("加载了");
        return new MyLocalesolver();
    }

}
