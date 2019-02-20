package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderServer {
	public static void main(String[] args) {
		//application development analyst
		//application development senior analyst
		SpringApplication.run(ProviderServer.class, args);
	}
}
