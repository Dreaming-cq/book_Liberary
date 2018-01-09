package com.chen.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chen.entity.book.Book;

public class BookMapping implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int id) throws SQLException {
		// TODO Auto-generated method stub
		
		Book book=new Book();
		book.setBook_id(rs.getString("book_id"));
		book.setBook_name(rs.getString("book_name"));
		book.setBook_author(rs.getString("book_author"));
		book.setBook_press(rs.getString("book_press"));
		book.setBook_date(rs.getDate("book_date"));
		book.setBook_state(rs.getString("book_state"));
		book.setBook_borrow(rs.getString("book_borrow"));
		book.setBorrow_date(rs.getDate("borrow_date"));
		book.setBook_return(rs.getString("book_return"));
		book.setReturn_date(rs.getDate("return_date"));
		book.setUser_id(rs.getString("User_id"));
		return book;
	}

}
