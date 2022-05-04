package com.springdemos.SpringJDBC.employee.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springdemos.SpringJDBC.employee.dto.Employee;
import com.springdemos.SpringJDBC.empoyeedao.EmployeeDao;

public class SpringJdbcApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringJDBC/employee/config/config.xml");
		EmployeeDao employeedao = (EmployeeDao) context.getBean("employeedao");

		createEmployee(employeedao);
//		deleteEmployee(employeedao);
//		updateEmployee(employeedao);

	}

	private static void createEmployee(EmployeeDao employeedao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFname("Max");
		emp.setLname("Rider");
		int result = employeedao.create(emp);
		System.out.println("Number of records inserted are: " + result);
	}
	
	private static void updateEmployee(EmployeeDao employeedao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFname("Charles");
		emp.setLname("Rider");
		int result = employeedao.update(emp);
		System.out.println("Number of records inserted are: " + result);
	}
	
	private static void deleteEmployee(EmployeeDao employeedao) {
		Employee emp = new Employee();
		emp.setId(1);
	
		int result = employeedao.delete(emp);
		System.out.println("Number of records inserted are: " + result);
	}

}
