package com.aravinthrajchakkaravarthy.userprofile.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aravinthrajchakkaravarthy.userprofile.dto.User;

@Service
public interface UserService {

	public List<User> fetchUserProfile();

	public List<User> fetchUserProfileByName(String name);

	public boolean createUserProfile(User user);

	public boolean updateUserProfile(User user);

	public boolean deleteUserProfile(User user);
}
