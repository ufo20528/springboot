package com.weizhe.springboot.dao.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.weizhe.springboot.model.user.User;
import com.weizhe.springboot.model.user.UserExample;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelectByPrimaryKey() {
		User user = userMapper.selectByPrimaryKey(1);
		User user2 = new User();
		user2.setId(1);
		user2.setUsername("weizhe1");
		user2.setPassword("12345");
		assertEquals(user2.toString(), user.toString());
	}
	
	@Test
	public void testSelectByExample()
	{
		UserExample example=new UserExample();
		example.createCriteria().andUsernameLike("k%");
		
		List<User> list= userMapper.selectByExample(example);
		assertTrue(list.size()>0);
	}

}
