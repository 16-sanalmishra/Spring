package com.springdemos.SpringCore.QuesAns;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/QuesAns/config.xml");
		
				

		// get the hospital bean from the container
		Question q1 = (Question) context.getBean("ques");

		// print the bean
		System.out.println(q1);
		System.out.println(q1.hashCode());
	

	}

}