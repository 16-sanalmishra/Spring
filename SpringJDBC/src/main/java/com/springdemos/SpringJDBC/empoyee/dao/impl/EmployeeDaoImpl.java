package com.springdemos.SpringJDBC.empoyee.dao.impl;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springdemos.SpringJDBC.employee.dto.Employee;
import com.springdemos.SpringJDBC.empoyee.dao.rowmapper.EmployeeRowMapper;
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

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id = ?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> employees = jdbcTemplate.query(sql, rowMapper);
		return employees;
	}

}