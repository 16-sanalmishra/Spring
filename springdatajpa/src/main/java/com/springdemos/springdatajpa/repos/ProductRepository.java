package com.springdemos.springdatajpa.repos;

import org.springframework.data.repository.CrudRepository;

import com.springdemos.springdatajpa.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
