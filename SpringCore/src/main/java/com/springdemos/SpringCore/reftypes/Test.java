package com.springdemos.SpringCore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/reftypes/config.xml");
	
		Student hos = (Student) context.getBean("student");
		System.out.println(hos);
		
	}
	

}
