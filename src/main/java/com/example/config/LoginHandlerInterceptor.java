package com.example.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//登录拦截器
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录成功后，有用户的Session
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser == null) {//没有登录
            request.setAttribute("msg", "没有权限，请登录");
            request.getRequestDispatcher("index.html").forward(request, response);
            return false;
        } else
            return true;
    }
}
