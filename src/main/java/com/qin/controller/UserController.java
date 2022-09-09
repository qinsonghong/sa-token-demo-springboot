package com.qin.controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    //测试登录，浏览器访问： http://localhost:8081/user/doLogin?username=zhang&password=123456
    @RequestMapping("doLogin")
    public String doLogin (String username, String password) {
        if("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return "登陆成功";
        }
        return "登录失败";
    }

    @RequestMapping("isLogin")
    public String isLogin() {
        return "当前会话是否登录："  +  StpUtil.isLogin();
    }

    @RequestMapping
    public String orLogin() {
        return "当前会话登录：is or no";
    }

    @RequestMapping
    public String getLogin() {
        return "url";
    }
}
