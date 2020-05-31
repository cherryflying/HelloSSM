package com.lxn.dao;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lxn.BaseTest;
import com.lxn.entity.User;

public class UserDaoTest extends BaseTest{
	@Autowired
private UserDao userDao;

@Test
public void testQueryByID() throws Exception{
	String userName = "mhd";
	String password="123456";
	User user=userDao.queryUserById(userName,password);
	System.out.print(user);
}

@Test
public void testQueryAll() throws Exception{
	java.util.List<User> userList=userDao.queryUserAll();
	System.out.println(userList);
}
}
