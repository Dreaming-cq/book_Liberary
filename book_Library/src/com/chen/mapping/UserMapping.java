package com.chen.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.chen.entity.User;

public class UserMapping implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int id) throws SQLException {
		// TODO Auto-generated method stub
		User user=new User();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setRealname(rs.getString("realname"));
		user.setSex(rs.getString("sex"));
		user.setTelephone(rs.getString("telephone"));
		user.setIdCard(rs.getString("idcard"));
		return user;
	}

}
