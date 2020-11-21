package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//扩展springMVC配置
@Configuration  //配置类
public class MyConfig implements WebMvcConfigurer {
    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addViewController("/atguigu").setViewName("success");
        //跳转首页
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        //假页面main.html与dashboard.html映射
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    @Override//配置登录拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/index.html", "/", "/user/login", "/css/*", "/js/*", "/img/*");
    }
}
