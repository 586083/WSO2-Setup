package com.aravinthrajchakkaravarthy.userprofile.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aravinthrajchakkaravarthy.userprofile.dto.User;
import com.aravinthrajchakkaravarthy.userprofile.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@Api(value = "User Maintainence COntroller", description = "This controller does CRUD User")
@ApiResponses(value = {
	    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
		})
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "View a list of available Users")
	@GetMapping(value = "/fecthUserProfile")
	public List<User> fetchUserProfile(){
		System.out.println("I am inside fetchUserProfile");
		return userService.fetchUserProfile();
	}
	
	@ApiOperation(value = "View a list of available Users by query with user Name")
	@GetMapping(value = "/fecthUserProfileName")
	public List<User> fetchUserProfileName(@RequestParam String name) throws InterruptedException{
		System.out.println("I am inside fetchUserProfileName");
		return userService.fetchUserProfileByName(name);
	}
	
	@ApiOperation(value = "Create a User")
	@PostMapping(value = "/createUserProfile")
	public boolean createUserProfile(@RequestBody User user){
		return userService.createUserProfile(user);
	}
	
	@ApiOperation(value = "Update a User")
	@PostMapping(value ="/updateUserProfile")
	public boolean updateUserProfile(@RequestBody User user) {
		return userService.updateUserProfile(user);
	}
	
	@ApiOperation(value = "Delete a User")
	@PostMapping(value ="/deleteUserProfile")
	public boolean deleteUserProfile(@RequestBody User user) {
		return userService.deleteUserProfile(user);
	}
}
