package com.aravinthrajchakkaravarthy.userprofile.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aravinthrajchakkaravarthy.userprofile.dto.User;

@Mapper
public interface UserDAO {

	public List<User> fetchUserProfile();

	public List<User> fetchUserProfileByName(String name);

	public boolean createUserProfile(User user);

	public boolean updateUserProfile(User user);

	public boolean deleteUserProfile(User user);
}
