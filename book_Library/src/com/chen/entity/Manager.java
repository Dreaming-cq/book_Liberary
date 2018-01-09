package com.chen.entity;

public class Manager {
	private String username;
	private String password;
	private String realname;
	private String telephone;
	private String sex;
	private String idCard;
	public Manager()
	{
		
	}
	
	/**
	 * @param username  用户id
	 * @param password  用户密码
	 * @param realname  用户的真实姓名
	 * @param telephone 用户的电话号码
	 * @param sex       用户的性别
	 * @param idCard	用户的身份证
	 */
	public Manager(String username, String password, String realname, String telephone, String sex, String idCard) {
		super();
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.telephone = telephone;
		this.sex = sex;
		this.idCard = idCard;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
}
