package com.cloud.service.impl;

import org.springframework.stereotype.Service;

import com.cloud.model.User;
import com.cloud.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User getUser() {
		User u=new User();
		u.setName("jack");
		u.setSex("male");
		return u;
	}
	
	
	
}
