package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.UserBean;
import com.database.DBConnection;

public class UserService {

	public void addUser(UserBean user) {
		try {
			Connection con = new DBConnection().getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into applicants(username,password) values (?,?)");
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean validateUser(UserBean user) {
		try {
			Connection con = new DBConnection().getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("select count(*) from applicants where username=? and password=?");
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			
			ResultSet res = pstmt.executeQuery();
			if (res.next()) {
				int status = res.getInt(1);
				if (status == 0)
					return false;
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void updateUser(UserBean user, String newPassword) {
		try {
			Connection con = new DBConnection().getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("update applicants set password=? where username=? and password=?");
			pstmt.setString(1, newPassword);
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getPassword());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
