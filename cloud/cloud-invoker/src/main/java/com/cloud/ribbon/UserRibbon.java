package com.cloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.cloud.model.User;

@Component
public class UserRibbon  {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private String url="http://provider-server/userLogic/info";
	
	public User getUser() {
		return restTemplate.getForObject(url, User.class);
	}

}
