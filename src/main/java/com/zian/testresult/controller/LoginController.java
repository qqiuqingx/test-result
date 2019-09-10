package com.zian.testresult.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)

    public String Login(@RequestParam("username") String name,
                        @RequestParam("password") String password, Map<String,Object> maps, HttpSession session){
        System.out.println("进入Controller方法");
        String mess="登陆失败";
        if (!"abc".equals(name)){
            maps.put("erro",mess);
            return "index";
        }
        if (!"123456".equals(password)){
            maps.put("erro",mess);
            return "index";
        }
        System.out.println("controller方法执行完毕");
        session.setAttribute("username",name);
        session.setMaxInactiveInterval(60*60*24);
        //防止表单重复提交 可以重定向
        return  "redirect:/main";
    }
}
