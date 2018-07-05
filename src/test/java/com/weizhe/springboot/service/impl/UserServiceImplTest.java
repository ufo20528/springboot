package com.weizhe.springboot.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.weizhe.springboot.model.user.User;
import com.weizhe.springboot.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testGetUserInt() {
		User user=userService.getUser(1);
		assertEquals("weizhe1", user.getUsername());

	}

	@Test
	public void testGetUserUserExample() {

	}

	@Test
	public void testInsertUser() {

	}

	@Test
	public void testUpdateUser() {

	}

	@Test
	public void testDeleteUser() {

	}

}
