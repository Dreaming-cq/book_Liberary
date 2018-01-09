package com.chen.DAO.book;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


import com.chen.mapping.BookMapping;

public class BookDAO implements IBookDAO{
	private JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getAllBook() {
		// TODO Auto-generated method stub
		String select_SQL="select * from book";
		
		return this.jdbcTemplate.query(select_SQL, new BookMapping());
	}

	@Override
	public int updateInfo(String book_id, String book_state, String book_borrow, Date borrow_date, String book_return,
			Date return_date, String user_id) {
		// TODO Auto-generated method stub
		String update_SQL="update book set book_state=?,book_borrow=?,borrow_date=?,book_return=?,return_date=?,user_id=? "+"where book_id=?";
		
		return this.jdbcTemplate.update(update_SQL,  book_state,  book_borrow,  borrow_date,  book_return,
			 return_date, user_id,book_id);
	}

	@Override
	public int insertInfo_manager(String book_id, String book_name, String book_author, String book_press,
			Date book_date, String book_state) {
		// TODO Auto-generated method stub
		
		
		String insert_SQL="insert into book(book_id,book_name,book_author,book_press,book_date,book_state)"+"values(?,?,?,?,?,?)";
		int i=this.jdbcTemplate.update(insert_SQL, book_id,book_name,book_author,book_press,book_date,book_state);
		return i;
	}

	@Override
	public int deleteInfo_manager(String book_id) {
		// TODO Auto-generated method stub
		String delete_SQL="delete book where book_id=?";
		int i=this.jdbcTemplate.update(delete_SQL, book_id);
		return i;
	}

	@Override
	public int updateInfo_manager(String book_id, String book_name, String book_author, String book_press,
			Date book_date) {
		// TODO Auto-generated method stub
		String update="update book set book_name=?,book_author=?,book_press=?,book_date=?"+" where book_id=?";
		return this.jdbcTemplate.update(update, book_name,book_author,book_press,book_date,book_id);
	}

	@Override
	public int updateState_manager(String book_id, String book_state, String book_borrow, Date borrow_date,
			String book_return, Date return_date, String user_id) {
		// TODO Auto-generated method stub
		String update="update book set book_state=?,book_borrow=?,borrow_date=?,book_return=?,return_date=?,user_id=?"+" where book_id=?";
		return this.jdbcTemplate.update(update, book_state,book_borrow,borrow_date,book_return,return_date,user_id,book_id);
	
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getSelfInfo(String user_id) {
		// TODO Auto-generated method stub
		String self_SQL="select * from book where user_id=?";
		
		return this.jdbcTemplate.query(self_SQL, new BookMapping(), user_id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getInfoByID_manager(String book_id) {
		// TODO Auto-generated method stub
		String self_SQL="select * from book where book_id=?";
		
		return this.jdbcTemplate.query(self_SQL, new BookMapping(), book_id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getInfoByState(String book_state) {
		// TODO Auto-generated method stub
		String find_SQL="select * from book where book_state=?";
		
		return this.jdbcTemplate.query(find_SQL, new BookMapping(),book_state);
	}
	

}
