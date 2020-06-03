package com.lxn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lxn.entity.UserBook;


public interface UserBookDao {
	 public List<UserBook> queryBookByUser(@Param("userId") String userId);
}
