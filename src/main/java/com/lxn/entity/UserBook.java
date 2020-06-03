package com.lxn.entity;

import java.util.Date;

public class UserBook {
	@Override
	public String toString() {
		return "UserBook [id=" + id + ", userId=" + userId + ", bookId=" + bookId + ", expireDate=" + expireDate + "]";
	}

	private String id;
	private String userId;
	private long bookId;
	private Date expireDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

}
