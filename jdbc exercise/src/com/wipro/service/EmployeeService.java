package com.wipro.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.wipro.bin.Employee1;
import com.wipro.util.DBConnecton;

public class EmployeeService {

	Connection conn = new DBConnecton().connect();

	public int insert(Employee1 emp) {

		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into employee(id,name,designation) value (?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getDesignation());
			
			int status=pstmt.executeUpdate();
			return status;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int delete(int id) {

		try {
			PreparedStatement pstmt = conn.prepareStatement("delete from employee where id=?");
			pstmt.setInt(1, id);
			
			int status=pstmt.executeUpdate();
			return status;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int update(Employee1 emp) {

		try {
			PreparedStatement pstmt = conn.prepareStatement("update employee set name=?, designation=? where id=?");
			pstmt.setInt(3, emp.getId());
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getDesignation());
			
			int status=pstmt.executeUpdate();
			return status;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public List<Employee1> showAll(){
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from employee");
			ResultSet rs=pstmt.executeQuery();
			List<Employee1> list=new ArrayList<Employee1>();
			while(rs.next()) {
				Employee1 emp=new Employee1();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setDesignation(rs.getString("designation"));
				
				list.add(emp);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
