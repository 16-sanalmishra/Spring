package com.springdemos.SpringCore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/standalone/collections/config.xml");
	
		ProductsList p = (ProductsList) context.getBean("prod");
		System.out.println(p);
		System.out.println(p.getProductNames().getClass());
		
		
	}
	

}
