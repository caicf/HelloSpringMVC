package com.caicf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

	private static Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value="/login/{userId}")
	public String login(@PathVariable("userId")String userId) {
		logger.debug("============");
		logger.info(userId);
		System.out.println(userId);
		System.out.println("=====");
		return "home";
	}
	
	@RequestMapping(value="/show")
	public String showCookie() {
		return "home";
	}
}
