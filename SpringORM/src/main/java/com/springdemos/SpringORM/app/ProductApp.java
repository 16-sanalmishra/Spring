package com.springdemos.SpringORM.app;

import java.util.List;

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
		
//		createProduct(productdao);
//		updateProduct(productdao);
//		deleteProduct(productdao);
//		findProduct(productdao, 2);
		findAllProducts(productdao);
	}

	private static void findAllProducts(ProductDao productdao) {
		List<Product> products = productdao.findAll();
		System.out.println(products);
	}

	private static void findProduct(ProductDao productdao, int id) {
		Product product = productdao.find(id);
		System.out.println(product);
	}

	private static void deleteProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(1);
		productdao.delete(product);
		
		System.out.println("Rows deleted ");
	}

	private static void updateProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(1);
		product.setName("iWatch");
		product.setDescription("best watch");
		product.setPrice(18000);
		productdao.update(product);
		System.out.println("Rows Updated ");
	}

	private static void createProduct(ProductDao productdao) {
		Product product = new Product();
		product.setId(2);
		product.setName("iWatch");
		product.setDescription("best watch");
		product.setPrice(21560);
		int result = productdao.create(product);
		System.out.println("Number of rows inserted: " + result);
	}
}