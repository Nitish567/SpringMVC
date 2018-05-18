package com.nitish.spring.model;

import lombok.Data;

@Data
public class Order {
	private String productName;
	private String customerName;
	private String quantity;

	public Order() {

	}

	public Order(String productName, String customerName, String quantity) {
		super();
		this.productName = productName;
		this.customerName = customerName;
		this.quantity = quantity;
	}

}
