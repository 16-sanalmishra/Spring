package com.springdemos.SpringCore.interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/interfaceinjection/config.xml");

		// get the hospital bean from the container
		Coach ad1 = (Coach) context.getBean("SuperCoach");

		// print the bean
		System.out.println(ad1);
		

	}

}