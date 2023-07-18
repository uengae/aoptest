package com.goodee.aoptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ServletComponentScan
@SpringBootApplication
public class AoptestApplication implements WebMvcConfigurer{
	@Autowired
	HandlerInterceptor myIntercepor;
	
	public static void main(String[] args) {
		SpringApplication.run(AoptestApplication.class, args);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		사용자가 만든 인터셉터를
		registry.addInterceptor(myIntercepor).addPathPatterns("/goodee/*");
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}

}
