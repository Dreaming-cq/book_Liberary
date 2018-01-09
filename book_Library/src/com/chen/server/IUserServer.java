package com.chen.server;

import java.util.List;

import com.chen.entity.User;

public interface IUserServer {
	public int inserInfo(User user);
	public int delete_Info(String username);
	public boolean checkInfo(String username,String password);
	@SuppressWarnings("rawtypes")
	public  List getAllInfo();
	/*
	 * �õ��Լ�����Ϣ
	 */
	@SuppressWarnings("rawtypes")
	public List getInfobyID(String username);
}
