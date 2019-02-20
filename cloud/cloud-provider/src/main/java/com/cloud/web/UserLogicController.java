package com.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.model.User;
import com.cloud.service.UserService;

@RestController
@RequestMapping("/userLogic")
public class UserLogicController {

	@Autowired
	private Environment env;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getName")
	public String getEnv() {
		return env.getProperty("test.user.name");
	}
	
	@GetMapping("/info")
	public User getUser() {
		return userService.getUser();
	}
	
}
