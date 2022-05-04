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
	public int update(Employee emp) {
		String sql = "update employee set firstname=? , lastname=? where id=?";
		int result = jdbcTemplate.update(sql, emp.getFname(), emp.getLname(),emp.getId());
		return result;
	}

	@Override
	public int delete(Employee emp) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql,emp.getId());
		return result;
	}

}