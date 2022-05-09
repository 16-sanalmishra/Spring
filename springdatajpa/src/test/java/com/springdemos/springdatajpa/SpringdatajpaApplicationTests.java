package com.springdemos.springdatajpa;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.springdemos.springdatajpa.entity.Product;
import com.springdemos.springdatajpa.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

	// @Test
	void create() {
		ProductRepository pr = context.getBean(ProductRepository.class);
		Product p = new Product(1234, "Sanal", "high", 0);
		pr.save(p);
	}

	// @Test
	void read() {
		ProductRepository pr = context.getBean(ProductRepository.class);
		Optional<Product> p = pr.findById(1234);
		Product product = null;
		if (p.isPresent()) {
			product = p.get();
		}
		System.out.println(product);

	}

//	@Test
	void updateProduct() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		Product product = new Product(3, "ball", "tennis ball", 70);
		repo.save(product);
	}

//	@Test
	void readAllProducts() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		List<Product> products = (List<Product>) repo.findAll();
		System.out.println(products);
	}

	@Test
	void delete() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		Product p = repo.deleteById(1234);
	}

}
