package com.yuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yuan.dao.UserDao;
import com.yuan.model.User;
import com.yuan.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public User findUserByUsername(String username) {
		return userDao.findUserByUsername(username);
	}

}
