package com.login.dao;

import java.sql.*;

public class LoginDao {
	
	String query = "select * from login where username=? and password=?";
	
	public boolean check(String username, String password) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/telusko", "root", "2736@Holy");
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
		return false;
	}

}
