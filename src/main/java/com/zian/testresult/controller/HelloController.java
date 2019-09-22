package com.zian.testresult.controller;

import com.zian.testresult.exceptin.UserNotExiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
/*    @Autowired
    private MessageSource MessageSource;*/
    @RequestMapping("/login")
    public  String index(){

        System.out.println("123123123");

        return "index";
    }
    @RequestMapping("/hello")
    public  String hello(@RequestParam("user") String user){
        System.out.println("进入测试异常方法方法");
        if (user.equals("aaa")){
            System.out.println("进入异常判断");
            throw new UserNotExiException("错误");
        }
  /*      map.put("hello","<h1>莎娃迪卡</h1>");
        map.put("user", Arrays.asList("zhangsan","19","四川"));*/
        return "asda";
    }
}
