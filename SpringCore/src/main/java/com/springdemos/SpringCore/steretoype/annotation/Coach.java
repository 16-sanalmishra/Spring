package com.springdemos.SpringCore.steretoype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SuperCoach")
public class Coach {

	@Value("323")
	int id;

	@Value("sanal")
	String name;

	@Value("${dbuser}")
	String dbuser;

	@Value("#{productNames}")
	List<String> products;
	@Autowired
	private CoachProfile cp;

	

	public CoachProfile getCp() {
		return cp;
	}

	public void setCp(CoachProfile cp) {
		this.cp = cp;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	public String getDbuser() {
		return dbuser;
	}

	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", dbuser=" + dbuser + ", products=" + products + ", cp=" + cp
				+ "]";
	}

	

}
