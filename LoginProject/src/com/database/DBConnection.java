package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userProject", "root", "password");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	public static void main(String[] args) {
//		
//		Connection con=new DBConnection().getConnection();
//		System.out.println(con);
//		
//	}

}
