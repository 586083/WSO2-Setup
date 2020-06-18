package com.aravinthrajchakkaravarthy.userprofile.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aravinthrajchakkaravarthy.userprofile.dao.UserDAO;
import com.aravinthrajchakkaravarthy.userprofile.dto.User;
import com.aravinthrajchakkaravarthy.userprofile.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<User> fetchUserProfile() {
		return userDAO.fetchUserProfile();
	}

	@Override
	public List<User> fetchUserProfileByName(String name) {
		return userDAO.fetchUserProfileByName(name);
	}

	@Override
	public boolean createUserProfile(User user) {
		return userDAO.createUserProfile(user);
	}

	@Override
	public boolean updateUserProfile(User user) {
		return userDAO.updateUserProfile(user);
	}

	@Override
	public boolean deleteUserProfile(User user) {
		return userDAO.deleteUserProfile(user);
	}

}
