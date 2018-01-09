package com.chen.server;

import java.util.List;

import com.chen.DAO.ManagerDAO;
import com.chen.entity.Manager;

public class ManagerServer implements IManagerServer{

	private ManagerDAO managerDAO;
	
	public ManagerDAO getManagerDAO() {
		return managerDAO;
	}

	public void setManagerDAO(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}

	@Override
	public int inserInfo(Manager manager) {
		// TODO Auto-generated method stub
		return this.managerDAO.insert_Info(manager);
	}

	@Override
	public int delete_Info(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkInfo(String username, String password) {
		// TODO Auto-generated method stub
		return this.managerDAO.checkInfo(username, password);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getAllInfo() {
		// TODO Auto-generated method stub
		return this.managerDAO.getAllInfo();
	}

}
