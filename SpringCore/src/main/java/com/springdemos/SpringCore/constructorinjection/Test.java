package com.springdemos.SpringCore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/constructorinjection/config.xml");
		
				

		// get the hospital bean from the container
		Address ad1 = (Address) context.getBean("address");

		// print the bean
		System.out.println(ad1);
		System.out.println(ad1.hashCode());
	

	}

}