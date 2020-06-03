package com.lxn.entity;

import java.util.Date;

public class UserBookEntity {

	@Override
	public String toString() {
		return "UserBookEntity [bookId=" + bookId + ", bookName=" + bookName + ", userId=" + userId + ", userName="
				+ userName + ", expireDate=" + expireDate + "]";
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	private long bookId;

	private String bookName;

	private String userId;
	private String userName;

	private Date expireDate;

}
