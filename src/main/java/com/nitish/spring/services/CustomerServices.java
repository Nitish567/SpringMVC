package com.nitish.spring.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nitish.spring.DAO.UserDAO;
import com.nitish.spring.model.Customer;

@Service
public class CustomerServices implements Services {

	AtomicInteger integer = new AtomicInteger(5);

	@Autowired
	@Qualifier("customerDAOImpl")
	private UserDAO<Customer> userDAO;

	@Override
	public void addUser(Customer customer) {

		int id = integer.incrementAndGet();
		customer.setCustomerID(String.valueOf(id));
		boolean saved = userDAO.saveInformation(customer);
		System.out.println("Saved Customer : " + saved);
	}

	@Override
	public void updateUser(Customer customer) {
		userDAO.saveInformation(customer);
	}

	@Override
	public Customer loadUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> loadUsers(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> loadUsers() {
		List<Customer> list = new ArrayList<>();
		System.out.println("in service");
		list = userDAO.getCustomerInformation();
		for(Customer customer : list){
			System.out.println(customer.getLastName());
		}
		return list;
	}

	@Override
	public List<String> loadUserNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer loadUserById(String userId) {
		
		Customer customer = userDAO.findUserById(userId);
		
		return customer;
	}

	@Override
	public boolean deleteUser(String customerId) {

		boolean success = userDAO.deleteInformation(customerId);

		return success;
	}

}
