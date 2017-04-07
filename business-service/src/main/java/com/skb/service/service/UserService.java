package com.skb.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.skb.service.dao.UserMapper;
import com.skb.service.domain.User;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
	public String insertUser(User user){		
		int i = userMapper.insertUser(user);		
		return JSON.toJSONString(i);
	}
	
	public String selectUserById(Integer id){
		User user = userMapper.selectUserById(id);
		return JSON.toJSONString(user);
	}
	

	public String deleteUserById(Integer id){
		int i = userMapper.deleteUserById(id);
		return JSON.toJSONString(i);
	}
	
	public String selectAllUsers(){
		List<User> users = new ArrayList<User>();		
		users = userMapper.selectAllUsers();
		
		return JSON.toJSONString(users);
	}
}

