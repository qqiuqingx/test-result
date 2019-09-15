package com.zian.testresult.localetest;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerIn implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
     /* String username= (String) request.getSession().getAttribute("username");
      if (username==null){
         //重定向到登录页
          request.setAttribute("erro","请先登录");
          //getRequestDispatcher获取转发器  forward转发request  和response
          request.getRequestDispatcher("/index").forward(request,response);
          return false;
      }else {
          //不为空放行
          return true;
      }*/
      return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
