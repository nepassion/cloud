package com.cloud.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class User {
	private String userId;
	private String name;
	private String sex;
	private LocalDate born;
	
}
