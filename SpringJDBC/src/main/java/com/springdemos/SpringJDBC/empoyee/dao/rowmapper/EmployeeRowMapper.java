package com.springdemos.SpringJDBC.empoyee.dao.rowmapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springdemos.SpringJDBC.employee.dto.Employee;



public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt(1));
		employee.setFname(rs.getString(2));
		employee.setLname(rs.getString(3));
		return employee;
	}

}
