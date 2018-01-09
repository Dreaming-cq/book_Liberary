package com.chen.server;

import java.util.List;

import com.chen.DAO.UserDAO;
import com.chen.entity.User;

public class UserServer implements IUserServer{

	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public int inserInfo(User user) {
		// TODO Auto-generated method stub
		return this.userDAO.insert_Info(user);
		
	}

	@Override
	public int delete_Info(String username) {
		// TODO Auto-generated method stub
		return this.userDAO.delete_Info(username);
	}

	@Override
	public boolean checkInfo(String username, String password) {
		// TODO Auto-generated method stub
		return this.userDAO.checkInfo(username, password);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getAllInfo() {
		// TODO Auto-generated method stub
		return this.userDAO.getAllInfo();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getInfobyID(String username) {
		// TODO Auto-generated method stub
		return this.userDAO.getInfobyID(username);
	}

}
