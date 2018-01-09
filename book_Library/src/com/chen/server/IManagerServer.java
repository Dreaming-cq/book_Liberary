package com.chen.server;

import java.util.List;

import com.chen.entity.Manager;
public interface IManagerServer {
	public int inserInfo(Manager manager);
	public int delete_Info(String username);
	public boolean checkInfo(String username,String password);
	@SuppressWarnings("rawtypes")
	public  List getAllInfo();
}
