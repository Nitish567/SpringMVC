package com.nitish.spring.services;

import java.util.List;

import com.nitish.spring.model.Customer;

public interface Services {
	
	void addUser(Customer customer);
	void updateUser(Customer customer);
	Customer loadUser(String userName);
	List<Customer> loadUsers(String userName);
	List<Customer> loadUsers();
	List<String> loadUserNames();
	Customer loadUserById(String userId);
	boolean deleteUser(String userId);

}
