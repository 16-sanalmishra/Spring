package com.springdemos.SpringCore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/set/config.xml");
	
		CarDealer cs = (CarDealer) context.getBean("carD");
		System.out.println(cs);
		System.out.println(cs.getModels().getClass());
	}
	

}
