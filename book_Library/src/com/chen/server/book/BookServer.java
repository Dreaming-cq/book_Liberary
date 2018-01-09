package com.chen.server.book;

import java.util.Date;
import java.util.List;

import com.chen.DAO.book.BookDAO;

public class BookServer implements IBookServer{

	private BookDAO bookDAO;
	
	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getAllBook() {
		// TODO Auto-generated method stub
		return this.bookDAO.getAllBook();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getSelfInfo(String user_id) {
		// TODO Auto-generated method stub
		return this.bookDAO.getSelfInfo(user_id);
	}

	@Override
	public int updateInfo(String book_id, String book_state, String book_borrow, Date borrow_date, String book_return,
			Date return_date, String user_id) {
		// TODO Auto-generated method stub
		return this.bookDAO.updateInfo(book_id, book_state, book_borrow, borrow_date, book_return, return_date, user_id);
	}

	@Override
	public int insertInfo_manager(String book_id, String book_name, String book_author, String book_press,
			Date book_date, String book_state) {
		// TODO Auto-generated method stub
		return this.bookDAO.insertInfo_manager(book_id, book_name, book_author, book_press, book_date, book_state);
	}

	@Override
	public int deleteInfo_manager(String book_id) {
		// TODO Auto-generated method stub
		return this.bookDAO.deleteInfo_manager(book_id);
	}

	@Override
	public int updateInfo_manager(String book_id, String book_name, String book_author, String book_press,
			Date book_date) {
		// TODO Auto-generated method stub
		return this.bookDAO.updateInfo_manager(book_id, book_name, book_author, book_press, book_date);
	}

	@Override
	public int updateState_manager(String book_id, String book_state, String book_borrow, Date borrow_date,
			String book_return, Date return_date, String user_id) {
		// TODO Auto-generated method stub
		return this.bookDAO.updateState_manager(book_id, book_state, book_borrow, borrow_date, book_return, return_date, user_id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getInfoByID_manager(String book_id) {
		// TODO Auto-generated method stub
		return this.bookDAO.getInfoByID_manager(book_id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getInfoByState(String book_state) {
		// TODO Auto-generated method stub
		return this.bookDAO.getInfoByState(book_state);
	}
	

}
