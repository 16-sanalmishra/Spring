package com.springdemos.SpringJDBC.empoyeedao;

import com.springdemos.SpringJDBC.employee.dto.Employee;

public interface EmployeeDao {

	

	int create(Employee emp);
	int update(Employee emp);
	int delete(Employee emp);
}
