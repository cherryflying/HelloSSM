package com.lxn.service;

import java.util.List;

import com.lxn.entity.Book;
import com.lxn.entity.User;
import com.lxn.entity.UserBook;

public interface UserService {
	
	
	User getUserByNameAndByPass(String name,String password);
	
	int insertUser(User user);
	
	User getUserByUserName(String userName);
	
	List <UserBook> queryBookByUser(String userId);
	
	Book queryById(Long bookId);

}
