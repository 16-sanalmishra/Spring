package com.springdemos.SpringCore.standalone.collections;

import java.util.List;

public class ProductsList {

	private List<String> ProductNames;

	public ProductsList() {
		super();
	}

	@Override
	public String toString() {
		return "ProductsList [ProductNames=" + ProductNames + "]";
	}

	public ProductsList(List<String> productNames) {
		ProductNames = productNames;
	}

	public List<String> getProductNames() {
		return ProductNames;
	}

	public void setProductNames(List<String> productNames) {
		ProductNames = productNames;
	}
}
