package com.springdemos.SpringCore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/dependencycheck/config.xml");

		// get the hospital bean from the container
		Prescription patient = (Prescription) context.getBean("patient");

		// print the bean
		System.out.println(patient);

	}

}