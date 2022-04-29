package com.springdemos.SpringCore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/map/config.xml");
	
		Customer hos = (Customer) context.getBean("customer");
		System.out.println(hos);
		
	}
	

}
