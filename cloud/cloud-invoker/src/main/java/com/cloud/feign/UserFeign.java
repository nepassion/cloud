package com.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cloud.feign.fallback.UserFeignFallback;
import com.cloud.model.User;

@FeignClient(name="provider-server",path="/userLogic",fallback=UserFeignFallback.class)
public interface UserFeign {
	
	@GetMapping("/info")
	public User getUser();
}
