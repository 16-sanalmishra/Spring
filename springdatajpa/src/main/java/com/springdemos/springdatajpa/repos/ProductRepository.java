package com.springdemos.springdatajpa.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springdemos.springdatajpa.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

	List<Product> findByName(String name);
	List<Product> findByNameAndPrice(String name,Double d);
}
