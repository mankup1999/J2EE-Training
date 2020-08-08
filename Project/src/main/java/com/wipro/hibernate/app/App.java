package com.wipro.hibernate.app;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.bean.Employee;

public class App {

	public void addEmployee(Employee employee) {
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		session.save(employee);

		session.getTransaction().commit();
		session.close();

	}

	public void deleteEmployee(int id) {
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Employee employee = session.get(Employee.class, id);
		if (employee != null) {
			session.delete(employee);
		}

		session.getTransaction().commit();
		session.close();

	}

	public void updateEmployee(int id, Employee newEmp) {
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Employee emp = session.get(Employee.class, id);
		if (emp != null) {
			emp.setID(id);
			emp.setCity(newEmp.getCity());
			emp.setDesignation(newEmp.getDesignation());
			emp.setEmailId(newEmp.getEmailId());
			emp.setGender(newEmp.getGender());
			emp.setMobileNo(newEmp.getMobileNo());
			emp.setName(newEmp.getName());
			emp.setSalary(newEmp.getSalary());
		}

		session.getTransaction().commit();
		session.close();

	}

	public Employee selectEmployee(int id) {
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Employee emp = session.get(Employee.class, id);

		session.getTransaction().commit();
		
		session.close();
		
		return emp;

	}
	
	public List<Employee> selectAllEmployee(){
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Query q=session.createQuery("from Employee");
		List<Employee> emps = q.getResultList();

		session.getTransaction().commit();
		
		session.close();
		
		return emps;

	}

	public static void main(String[] args) {

//		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
//		System.out.println("Hello World");
	}

}
