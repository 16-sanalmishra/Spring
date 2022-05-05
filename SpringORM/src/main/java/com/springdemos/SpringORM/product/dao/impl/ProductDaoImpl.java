package com.springdemos.SpringORM.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springdemos.SpringORM.product.dao.ProductDao;
import com.springdemos.SpringORM.product.entity.Product;



@Component
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Integer result  = (Integer) hibernateTemplate.save(product);
		return result;
	}

}
