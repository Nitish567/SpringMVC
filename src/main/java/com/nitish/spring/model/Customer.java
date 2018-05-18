package com.nitish.spring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

	private String customerID;
	private String firstName;
	private String lastName;
	private String email;

	private String username;
	private String password;

	private Address address;

	public Customer() {

	}

	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

//	@Override
//	public String toString() {
//		return "Customer [First Name=" + firstName + ", Last Name=" + lastName + ", email =" + email
//				+ ", Street address=" + address.getAddress() + ", City " + address.getCity() + ", State ="
//				+ address.getState() + " , Zip" + address.getZipCode() + " ]";
//	}
	
	public Customer(String customerID,String firstName, String lastName, String email, String username, String password) {
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [First Name=" + firstName + ", Last Name=" + lastName + ", email =" + email + " ]";
	}

}
