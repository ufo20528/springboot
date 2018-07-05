package com.weizhe.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weizhe.springboot.dao.user.UserMapper;
import com.weizhe.springboot.model.user.User;
import com.weizhe.springboot.model.user.UserExample;
import com.weizhe.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUser(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getUser(UserExample example) {
		return userMapper.selectByExample(example);
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public int deleteUser(int id) {
		return userMapper.deleteByPrimaryKey(id);
	}

}
