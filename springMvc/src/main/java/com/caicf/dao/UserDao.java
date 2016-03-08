package com.caicf.dao;

import java.util.List;

import com.caicf.model.User;

public interface UserDao {
	
	public User login(User user);
	
	public List<User> selectUser(User user);
	
}
