package com.chen.DAO;

import java.util.Iterator;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.chen.entity.Manager;
import com.chen.mapping.ManagerMapping;


public class ManagerDAO implements IManagerDAO{
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int insert_Info(Manager manager) {
		// TODO Auto-generated method stub
		String insert_SQL="insert into book_manager(username,password,realname,telephone,sex,idcard)"+"values(?,?,?,?,?,?)";
		int i=this.jdbcTemplate.update(insert_SQL,manager.getUsername(),manager.getPassword(),manager.getRealname(),manager.getTelephone(),manager.getSex(),manager.getIdCard());
		
		return i;
	}

	@Override
	public int delete_Info(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean checkInfo(String username, String password) {
		// TODO Auto-generated method stub
		boolean checked=false;
		Iterator ite=this.getAllInfo().iterator();
		while(ite.hasNext())
		{
			Manager user=(Manager) ite.next();
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
	String get_SQL="select * from book_manager";
		
		return this.jdbcTemplate.query(get_SQL,new ManagerMapping());
	}

}
