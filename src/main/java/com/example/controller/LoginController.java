package com.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    //@ResponseBody//视图,不会跳转路径，而是写入 HTTP 响应正文中
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password
            , Model model, HttpSession session) {
        //登陆成功
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";//跳转到假页面main.html
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/main.html";
    }

}
