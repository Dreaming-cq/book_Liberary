package com.chen.entity.book;

import java.util.Date;


import com.chen.entity.User;

public class Book 
{
	private String book_id;
	private String book_name;
	private String book_author;
	private String book_press;
	private Date book_date;
	private String book_state;
	private String book_borrow;
	private Date borrow_date;
	private String book_return;
	private Date return_date;
	private String user_id;
	private User user;

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Book()
	{
		
	}
	
	
	public Book(String book_id, String book_name, String book_author, String book_press, Date book_date,
			String book_state) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_press = book_press;
		this.book_date = book_date;
		this.book_state = book_state;
		
	}

	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_press() {
		return book_press;
	}
	public void setBook_press(String book_press) {
		this.book_press = book_press;
	}
	public Date getBook_date() {
		return book_date;
	}
	public void setBook_date(Date book_date) {
		this.book_date = book_date;
	}
	public String getBook_state() {
		return book_state;
	}
	public void setBook_state(String book_state) {
		this.book_state = book_state;
	}
	public String getBook_borrow() {
		return book_borrow;
	}
	public void setBook_borrow(String book_borrow) {
		this.book_borrow = book_borrow;
	}
	public Date getBorrow_date() {
		return borrow_date;
	}
	public void setBorrow_date(Date borrow_date) {
		this.borrow_date = borrow_date;
	}
	public String getBook_return() {
		return book_return;
	}
	public void setBook_return(String book_return) {
		this.book_return = book_return;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	

}
