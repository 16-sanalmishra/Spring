package com.springdemos.SpringCore.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SuperCoach")
public class Coach {

	

	@Value("323")
	int id;

	@Value("sanal")
	String name;
	
	@Autowired
	@Qualifier("basketBall")
	private Sport sport1;
	
	@Autowired
	@Qualifier("cricket")
	private Sport sport2;

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
		return "Coach [id=" + id + ", name=" + name + ", sport1=" + sport1.play() + ", sport2=" + sport2.play() + "]";
	}

	
	

}
