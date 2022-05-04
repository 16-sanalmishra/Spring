package com.springdemos.SpringJDBC.empoyeedao;

import com.springdemos.SpringJDBC.employee.dto.Employee;

public interface EmployeeDao {

	void createemployee(Employee emp);

	int create(Employee emp);
}
