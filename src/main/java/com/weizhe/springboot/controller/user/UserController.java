package com.weizhe.springboot.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weizhe.springboot.model.Result;
import com.weizhe.springboot.model.user.User;
import com.weizhe.springboot.model.user.UserExample;
import com.weizhe.springboot.service.UserService;
import com.weizhe.springboot.util.ResultUtil;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 获取用户列表
	 * 
	 * @return
	 */
	@GetMapping("/user")
	public Result<List<User>> getUser() {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameLike("k%");
		List<User> user = userService.getUser(example);
		
		return ResultUtil.suceess(user);
	}

	/**
	 * 添加一个用户
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@PostMapping("/user")
	public Result<Integer> insertUser(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);

		int id = userService.insertUser(user);
		return ResultUtil.suceess(id);
	}

	/**
	 * 查询一个用户
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/user/{id}")
	public Result<User> getUser(@PathVariable("id") Integer id) {
		return ResultUtil.suceess(userService.getUser(id));
	}

	/**
	 * 更新一个用户
	 * 
	 * @param id
	 * @param username
	 * @param password
	 * @return
	 */
	@PutMapping("/user/{id}")
	public Boolean updateUser(@PathVariable("id") Integer id, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		return userService.updateUser(user) == 1;
	}

	/**
	 * 删除一个用户
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/user/{id}")
	public Boolean deleteUser(@PathVariable("id") Integer id) {
		return userService.deleteUser(id) == 1;
	}

}
