package com.tl.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tl.mapper.UserMapper;
import com.tl.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User selectUserByUsername(String username) {
		User user = userMapper.selectUserByUsername(username);
		return user;
	}

	@Override
	public List<User> selectAll() {
		List<User> list = userMapper.selectAll();
		return list;
	}

	

}
