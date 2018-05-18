package com.nitish.spring.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nitish.spring.model.Customer;

public class ProductDAOImpl<T> implements UserDAO<T> {

	Map<String, String> productMap = new HashMap<>();

	public ProductDAOImpl() {

	}

	@Override
	public boolean saveInformation(T obj) {

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
