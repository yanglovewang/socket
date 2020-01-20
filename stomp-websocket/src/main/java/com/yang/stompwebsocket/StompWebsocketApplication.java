package com.yang.stompwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class StompWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(StompWebsocketApplication.class, args);
	}

	/**
	 * 嵌入式servlet容器配置全局路径
	 * @return
	 */
	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
		return factory -> factory.setContextPath("/user");
	}

}
