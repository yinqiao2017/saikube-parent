package com.skb.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.skb.service.domain.User;

/**
 * Created by Administrator on 2016/9/2.
 */
@Mapper
public interface UserMapper {
		
	/**
	 * 新增user
	 * @param user
	 */
	int insertUser(User user);
	
	
	/**
	 * 根据用户名查询用户
	 * @param user
	 * @return
	 */
	User selectUserById(Integer id);
	
	int deleteUserById(Integer id);
	
	int updateUserOnNameById(User user);
	
	List<User> selectAllUsers();
	
}

