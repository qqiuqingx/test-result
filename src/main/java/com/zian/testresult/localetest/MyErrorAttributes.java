package com.zian.testresult.localetest;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

public class MyErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
       Map<String,Object> map=super.getErrorAttributes(requestAttributes, includeStackTrace);
       map.put("company","zian");
       //requestAttributes.getAttribute("exit",0) 异常处理器携带的数据
       map.put("exir",requestAttributes.getAttribute("exit",0));
        return map;
    }
}
