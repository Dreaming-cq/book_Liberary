package com.chen.DAO;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.chen.entity.User;
import com.chen.mapping.UserMapping;

public class UserDAO implements IUserDAO{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert_Info(User user) {
		// TODO Auto-generated method stub
		String insert_SQL="insert into book_user(username,password,realname,telephone,sex,idcard)"+"values(?,?,?,?,?,?)";
		int i=this.jdbcTemplate.update(insert_SQL,user.getUsername(),user.getPassword(),user.getRealname(),user.getTelephone(),user.getSex(),user.getIdCard());
		
		return i;
	}

	@Override
	public int delete_Info(String username) {
		// TODO Auto-generated method stub
		String delete_SQL="delete book_user where username=?";
		int i=this.jdbcTemplate.update(delete_SQL, username);
		return i;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean checkInfo(String username, String password) {
		// TODO Auto-generated method stub
		boolean checked=false;
		Iterator ite=this.getAllInfo().iterator();
		while(ite.hasNext())
		{
			User user=(User) ite.next();
			if(user.getUsername().equals(username)&&user.getPassword().equals(password))
			{
				checked=true;
			}
			
		}
		return checked;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getAllInfo() {
		// TODO Auto-generated method stub
		String get_SQL="select * from book_user";
		
		return this.jdbcTemplate.query(get_SQL,new UserMapping());
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getInfobyID(String username) {
		// TODO Auto-generated method stub
		String byID_SQL="select * from book_user where username=?";
		
		return this.jdbcTemplate.query(byID_SQL,  new UserMapping(),username);
	}

}
