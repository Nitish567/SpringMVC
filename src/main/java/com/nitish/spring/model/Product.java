package com.nitish.spring.model;

import lombok.Data;

@Data
public class Product {
	private String productName;
	private String productDescription;
	private String price;
	public Product() {
		
	}
	public Product(String productName, String productDescription, String price) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}
	
}
