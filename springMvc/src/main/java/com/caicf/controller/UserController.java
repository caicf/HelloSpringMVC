package com.caicf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class UserController {

	private static Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/login")
	public String login() {
		logger.debug("============");
		System.out.println("=====");
		return "home";
	}
}
