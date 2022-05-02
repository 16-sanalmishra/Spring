package com.springdemos.SpringCore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/propertyplaceholder/config.xml");
		
				

		// get the hospital bean from the container
		MyDAO ad1 = (MyDAO) context.getBean("mydao");

		// print the bean
		System.out.println(ad1);
		System.out.println(ad1.hashCode());
	

	}

}