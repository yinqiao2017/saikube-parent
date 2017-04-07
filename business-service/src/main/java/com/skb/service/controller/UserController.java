package com.skb.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skb.service.domain.User;
import com.skb.service.service.UserService;


@RestController
@RequestMapping({ "/user" })
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public String test() {

		return "hello world";
	}
	
	@RequestMapping(value = "/add")
	@ResponseBody
	public String addUser() {

		User user = new User();
		user.setName("小明");
		user.setAge(20);
		
		return userService.insertUser(user);
	}
	
	@RequestMapping(value = "/queryUserById")
	@ResponseBody
	public String selectUserById(Integer id) {
		return userService.selectUserById(id);
	}
	
	@RequestMapping(value = "/deleteUserById")
	@ResponseBody
	public String deleteUserById(Integer id) {
		return userService.deleteUserById(id);
	}
	
	@RequestMapping(value = "/qeuryAll")
	@ResponseBody
	public String selectAllUsers() {
		return userService.selectAllUsers();
	}
}

