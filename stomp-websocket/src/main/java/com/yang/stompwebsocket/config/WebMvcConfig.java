package com.yang.stompwebsocket.config;

import com.yang.stompwebsocket.config.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web相关配置
 * @author yang
 * @date 2018/7/9
 * @since 1.0.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 视图控制器
     */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
		registry.addViewController("/notice").setViewName("notice");
		registry.addViewController("/dep1").setViewName("dep1");
		registry.addViewController("/dep2").setViewName("dep2");
		registry.addViewController("/dep3").setViewName("dep3");
	}

	/**
	 * 添加拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//对请求进行登录拦截
//		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user/**","/chat","/sendToUser","/pullUnreadMessage");
	}

}
