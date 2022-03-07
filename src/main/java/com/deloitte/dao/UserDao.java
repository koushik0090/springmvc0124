package com.deloitte.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.deloitte.model.Register;

public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbCTemplateObj;
	
	public boolean registerUser(final Register registerInputValues) {
		
		String userInsertQuery = "insert into user_entity values(?,?,?,?,?,?,?)";
		try {
			
			jdbCTemplateObj.update(userInsertQuery, new PreparedStatementSetter() {
		
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					int i = 50;
					ps.setInt(1, ++i);
					ps.setString(2, registerInputValues.getUserAddress());
					ps.setString(3, registerInputValues.getUserEmail());
					ps.setString(4, registerInputValues.getUserName());
					ps.setString(5,  registerInputValues.getUserPassword());
					ps.setInt(6, Integer.parseInt(registerInputValues.getUserPhone()));
					ps.setString(7, registerInputValues.getUserRole());
					i = ++i;
				}
				
			});
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
			
		}
		return true;
	}
	

}
