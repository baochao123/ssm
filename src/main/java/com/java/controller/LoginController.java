package com.java.controller;

import com.java.pojo.Login;
import com.java.service.IloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private IloginService loginService;
    @RequestMapping(value = "/login.do",produces= "application/json;charset=utf-8")
    @ResponseBody//要导入json包fastjson......一系列包
    public String test(Login login){
        int i=loginService.insert(login);
        String message=(i==1)?"新增成功":"新增失败";
        return message;
    }
}
