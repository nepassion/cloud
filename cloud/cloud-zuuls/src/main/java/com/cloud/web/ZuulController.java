package com.cloud.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("")
public class ZuulController {
	@GetMapping("/zuul")
	public String zuulMsg() {
		return "zuul clevers";
	}
}
