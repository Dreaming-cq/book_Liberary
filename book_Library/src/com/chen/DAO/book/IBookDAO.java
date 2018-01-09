package com.chen.DAO.book;

import java.util.Date;
import java.util.List;

public interface IBookDAO 
{
	/*
	 * 得到图书的所有信息
	 */
	@SuppressWarnings("rawtypes")
	public List getAllBook();
	/*
	 * 用户得到自己的借阅信息
	 */
	@SuppressWarnings("rawtypes")
	public List getSelfInfo(String user_id);
	/*
	 * 借阅信息:根据图书的id来管理借阅信息
	 * 
	 */
	public int updateInfo(String book_id,String book_state,String book_borrow,Date borrow_date,String book_return,Date return_date,String user_id);
	
	/*
	 * 管理员：录入信息
	 */
	public int insertInfo_manager(String book_id, String book_name, String book_author, String book_press, Date book_date,
			String book_state);
	/*
	 * 管理员：删除图书信息
	 */
	public int deleteInfo_manager(String book_id);
	/*
	 * 管理员：更改图书信息不改变借书的状态
	 */
	public int updateInfo_manager(String book_id, String book_name, String book_author, String book_press, Date book_date);
	/*
	 * 管理员：更改图书信息改变借书的状态
	 */
	public int updateState_manager(String book_id,String book_state,String book_borrow,Date borrow_date,String book_return,Date return_date,String user_id);
	/*
	 * 管理员：根据id来查找书本信息
	 */
	@SuppressWarnings("rawtypes")
	public List getInfoByID_manager(String book_id);
	/*
	 * 管理员：根据书本状态查找所有的借阅信息
	 */
	@SuppressWarnings("rawtypes")
	public List getInfoByState(String book_state);
}
