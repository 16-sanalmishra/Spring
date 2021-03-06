package com.springdemos.SpringCore.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/beanscopes/config.xml");

		// get the hospital bean from the container
		Address ad1 = (Address) context.getBean("address");

		// print the bean
		System.out.println(ad1);
		System.out.println(ad1.hashCode());
		
		Address ad2 = (Address) context.getBean("address");
		System.out.println(ad2);
		System.out.println(ad2.hashCode());

	}

}