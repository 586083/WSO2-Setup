package com.aravinthrajchakkaravarthy.userprofile.dto;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;

@Component
public class User {
	
	@ApiModelProperty(value= "Contain user name details")
	private String userName;
	@ApiModelProperty(value= "Contain user age details")
	private int userAge;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
}
