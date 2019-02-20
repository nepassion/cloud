package com.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.feign.UserFeign;
import com.cloud.model.User;
import com.cloud.ribbon.UserRibbon;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserFeign userFeign;
	
	@Autowired
	private UserRibbon userRibbon;
	
	@GetMapping("/info")
	public User getUser() {
		return userFeign.getUser();
	}
	
	@GetMapping("/infoRibbon")
	public User getUser2() {
		return userRibbon.getUser();
	}

}
