package com.springdemos.SpringCore.lifecycle.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/lifecycle/annotations/config.xml");
		context.registerShutdownHook();

		// get the hospital bean from the container
		Patient patient = (Patient) context.getBean("patient");
		
		// print the bean
		System.out.println(patient);
		
	}

}