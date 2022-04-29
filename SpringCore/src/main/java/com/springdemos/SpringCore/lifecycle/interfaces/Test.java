package com.springdemos.SpringCore.lifecycle.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/lifecycle/interfaces/config.xml");
	
		Patient cs = (Patient) context.getBean("lifecycle");
		System.out.println(cs);
		context.registerShutdownHook();
		
	}
	

}
