package com.springdemos.SpringCore.ShoppingCart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/SpringCore/ShoppingCart/config.xml");
	
		Cart sc = (Cart) context.getBean("scart");
		System.out.println(sc);
		
	}
	

}
