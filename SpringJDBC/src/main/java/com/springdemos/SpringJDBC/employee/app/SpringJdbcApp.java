package com.springdemos.SpringJDBC.employee.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springdemos.SpringJDBC.employee.dto.Employee;
import com.springdemos.SpringJDBC.empoyeedao.EmployeeDao;



public class SpringJdbcApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/SpringJDBC/employee/config/config.xml");
		EmployeeDao employeedao = (EmployeeDao) context.getBean("employeedao");
		
		createEmployee(employeedao);
		
	}

	private static void createEmployee(EmployeeDao employeedao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFname("Max");
		emp.setLname("Rider");
		int result = employeedao.create(emp);
		System.out.println("Number of records inserted are: " + result);
	}
	
}
