package com.goodee.aoptest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class MyAspect {
	@Before("execution(* com.goodee.aoptest.controller.HelloController.one(..))")
	public void beforeLog() {
		log.debug("(전)aop");
	}
	
	
	@After("execution(* com.goodee.aoptest.controller.HelloController.one(..))")
	public void afterLog() {
		log.debug("(후)aop");
	}
}
