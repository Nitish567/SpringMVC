package com.nitish.spring.DAO;

import java.util.List;

import com.nitish.spring.model.Customer;

public class OrderDAOImpl<T> implements UserDAO<T> {

	@Override
	public boolean saveInformation(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteInformation(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> getInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomerInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateInformation(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
