package com.springdemos.SpringJDBC.empoyee.dao.impl;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springdemos.SpringJDBC.employee.dto.Employee;
import com.springdemos.SpringJDBC.empoyeedao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jdbcTemplate;
	
	public int create(Employee employee) {
		String sql = "insert into employee values (?, ?, ?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFname(), employee.getLname());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void createemployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}