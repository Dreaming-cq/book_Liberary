package com.chen.DAO;

import java.util.List;

import com.chen.entity.User;

/**
 * @author ��ǿ
 *
 */
public interface IUserDAO {
	public int insert_Info(User user);
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
