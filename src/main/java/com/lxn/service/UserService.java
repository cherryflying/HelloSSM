package com.lxn.service;

import com.lxn.entity.User;

public interface UserService {
	
	
	User getUserByNameAndByPass(String name,String password);
	
	int insertUser(User user);
	
	User getUserByUserName(String userName);

}
