package com.zian.testresult.controller;

import com.zian.testresult.exceptin.UserNotExiException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 自定义异常处理器
 */
@ControllerAdvice
public class MyExceptionHander {
    //浏览器及客户端返回的都是json字符串
/*    @ResponseBody
    @ExceptionHandler(UserNotExiException.class)
    public Map<String,Object> handException(Exception e){
        Map<String,Object> maps=new HashMap<>();
        maps.put("code","user.status");
        maps.put("message",e.getMessage());
        return maps;
    }*/


    @ExceptionHandler(UserNotExiException.class)
    public String handException(Exception e, HttpServletRequest request){
        System.out.println("进入自定义异常判断");
        Map<String,Object> maps=new HashMap<>();
        //设置自己的错误状态码4xx 5xx，否则就不会进入定制错误页面的解析流程
        /**
         *          * Integer statusCode = (Integer) request
         *          .getAttribute("javax.servlet.error.status_code");
         */
        request.setAttribute("javax.servlet.error.status_code",500);
        maps.put("code","user.status");
        maps.put("message","自定义异常信息");
        request.setAttribute("exit",maps);
        System.out.println("自定义异常完成");
        //转发
        return "forward:/error";
    }

}
