package com.chen.DAO;

import java.util.List;

import com.chen.entity.Manager;

public interface IManagerDAO {
	public int insert_Info(Manager manager);
	public int delete_Info(String username);
	public boolean checkInfo(String username,String password);
	@SuppressWarnings("rawtypes")
	public  List getAllInfo();
	
}
