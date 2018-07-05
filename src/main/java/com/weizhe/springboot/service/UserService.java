package com.weizhe.springboot.service;

import java.util.List;

import com.weizhe.springboot.model.user.User;
import com.weizhe.springboot.model.user.UserExample;

public interface UserService {
	
	public User getUser(int id);
	
	public List<User> getUser(UserExample example);
	
	public int insertUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(int id);
}
