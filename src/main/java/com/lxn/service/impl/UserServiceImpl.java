package com.lxn.service.impl;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxn.dao.BookDao;
import com.lxn.dao.UserBookDao;
import com.lxn.dao.UserDao;
import com.lxn.entity.Book;
import com.lxn.entity.User;
import com.lxn.entity.UserBook;
import com.lxn.service.UserService;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserBookDao userBookDao;
	
	@Autowired
	private BookDao bookDao;
	
	public User getUserByNameAndByPass(String name, String password) {
		return userDao.queryUserById(name, password);
	}
	
	
	public int insertUser(User user) {
	return userDao.insertUser(user);
	}


	public User getUserByUserName(String userName) {
		return userDao.queryUserByUserName(userName);
	}


	public List<UserBook> queryBookByUser(String userId) {
	return userBookDao.queryBookByUser(userId);
	}


	public Book queryById(Long bookId) {
	return bookDao.queryById(bookId);
	}






}
