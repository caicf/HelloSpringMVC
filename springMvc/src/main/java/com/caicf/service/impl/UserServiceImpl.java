package com.caicf.service.impl;

import com.caicf.dao.UserDao;
import com.caicf.model.User;
import com.caicf.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public User doLogin(User user) {
		return userDao.login(user);
	}

}
