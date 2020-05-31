package com.lxn.service.impl;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxn.dao.UserDao;
import com.lxn.entity.User;
import com.lxn.service.UserService;

@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserDao userDao;
	public User getUserByNameAndByPass(String name, String password) {
		return userDao.queryUserById(name, password);
	}
	
	
	public int insertUser(User user) {
	return userDao.insertUser(user);
	}


	public User getUserByUserName(String userName) {
		return userDao.queryUserByUserName(userName);
	}


}
