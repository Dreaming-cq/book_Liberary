package com.chen.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.chen.entity.Manager;

public class ManagerMapping implements RowMapper<Manager> {
	@Override
	public Manager mapRow(ResultSet rs, int id) throws SQLException {
		// TODO Auto-generated method stub
		Manager user=new Manager();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setRealname(rs.getString("realname"));
		user.setSex(rs.getString("sex"));
		user.setTelephone(rs.getString("telephone"));
		user.setIdCard(rs.getString("idcard"));
		return user;
	}
}
