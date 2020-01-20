package com.yang.stompwebsocket.config.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 定义一些页面需要做登录检查
 *
 * @author yang
 * @date 2018/7/26
 * @since 1.0.0
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    /**
     * 检查是否已经登录
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("登录拦截");
        return true;
    }
}
