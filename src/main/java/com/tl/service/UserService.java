package com.tl.service;

import java.util.List;

import com.tl.pojo.User;

public interface UserService {
	//根据用户名查询用户
	User selectUserByUsername(String username);
	
	//显示所有用户
	List<User> selectAll();
}
