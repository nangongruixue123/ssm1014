package com.yuan.dao;

import org.apache.ibatis.annotations.Param;

import com.yuan.model.User;

public interface UserDao {

	User findUserByUsername(@Param(value="username") String username); 
	
}
