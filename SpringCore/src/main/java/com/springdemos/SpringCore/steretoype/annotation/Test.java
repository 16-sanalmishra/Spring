package com.springdemos.SpringCore.steretoype.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/steretoype/annotation/config.xml");

		// get the hospital bean from the container
		Coach ad1 = (Coach) context.getBean("SuperCoach");

		// print the bean
		System.out.println(ad1);
		System.out.println(ad1.hashCode());
		

	}

}