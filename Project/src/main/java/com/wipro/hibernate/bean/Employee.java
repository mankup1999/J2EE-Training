package com.wipro.hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	private String Name;
	@Id
	@GeneratedValue
	private int ID;
	private String Gender;
	private String Designation;
	private double Salary;
	private String City;
	private String EmailId;
	private String MobileNo;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", ID=" + ID + ", Gender=" + Gender + ", Designation=" + Designation
				+ ", Salary=" + Salary + ", City=" + City + ", EmailId=" + EmailId + ", MobileNo=" + MobileNo + "]";
	}

}
