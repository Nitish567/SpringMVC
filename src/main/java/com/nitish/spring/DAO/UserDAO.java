package com.nitish.spring.DAO;

import java.util.List;

import com.nitish.spring.model.Customer;

public interface UserDAO<T> {

	public boolean saveInformation(T obj);

	public boolean deleteInformation(String id);
	
	public Customer updateInformation(Customer customer);

	public List<T> getInformation();

	public List<Customer> getCustomerInformation();

	public Customer findUserById(String userId);

}
