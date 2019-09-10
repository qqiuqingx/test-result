package com.zian.testresult.localetest;

import org.springframework.boot.autoconfigure.web.WebMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 在连接上携带区域信息
 */

public class MyLocalesolver implements LocaleResolver {
    /**
     * 解析区域信息
     * @param request
     * @return
     */
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l=request.getParameter("l");
        //得到本地国家代码设置
        Locale aDefault = Locale.getDefault();
        if (!StringUtils.isEmpty(l)){
            String[]srs=l.split("_");
            //创建一个语言是srs[0],国家是srs[1]的Locale对象
            aDefault=new Locale(srs[0],srs[1]);
            }
        return aDefault;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
