package com.springdemos.SpringORM.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemos.SpringORM.product.dao.ProductDao;
import com.springdemos.SpringORM.product.entity.Product;

public class ProductApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/SpringORM/config/config.xml");
		ProductDao productdao = (ProductDao) context.getBean("productDaoImpl");
		
		createProduct(productdao);
	}

	private static void createProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(1);
		product.setName("iWatch");
		product.setDescription("best watch");
		product.setPrice(21560);
		int result = productdao.create(product);
		System.out.println("Number of rows inserted: " + result);
	}
}