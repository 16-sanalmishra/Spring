package com.springdemos.SpringCore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/properties/config.xml");
	
		Locations hos = (Locations) context.getBean("loc");
		System.out.println(hos);
		System.out.println(hos.getDailetc().getClass());
	}
	

}
