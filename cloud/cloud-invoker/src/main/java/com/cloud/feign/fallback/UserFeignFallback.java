package com.cloud.feign.fallback;

import org.springframework.stereotype.Component;

import com.cloud.feign.UserFeign;
import com.cloud.model.User;

@Component
public class UserFeignFallback implements UserFeign{

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
