package com.goodee.aoptest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class HelloController {
	@GetMapping("/goodee/one")
	public String one() {
		log.debug("HelloController.one()");
		return "";
	}
	@GetMapping("/goodee/two")
	public String two() {
		log.debug("HelloController.two()");
		return "";
	}
}
