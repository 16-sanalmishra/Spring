package com.springdemos.SpringCore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

	int id;

	public int getId() {
	
		return id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet");		
	}
}

