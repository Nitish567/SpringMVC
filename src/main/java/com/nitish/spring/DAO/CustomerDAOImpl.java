package com.nitish.spring.DAO;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.springframework.stereotype.Repository;

import com.nitish.spring.model.Customer;

@Repository
public class CustomerDAOImpl<T> implements UserDAO<T> {
	
	
	

	Map<String, Customer> customerMap = new HashMap<>();
	public CustomerDAOImpl(){
		
		customerMap.put("1", new Customer("1","Vibhav", "bhangale", "vib@gmail.com", "vibhavbhangale", "Webhy"));
		customerMap.put("2", new Customer("2","Prabhu", "Sivamoorthy", "prabhu@gmail.com", "prabhu", "phymun"));
		customerMap.put("3", new Customer("3","Sandeep", "", "sandeep@gmail.com", "sandeep", "numphy"));
		customerMap.put("4", new Customer("4","Siddharth", "Ramachandra", "siddharth@gmail.com", "siddharth", "pitfall"));
		customerMap.put("5", new Customer("5","Harman", "Singh", "harman@gmail.com", "harman", "lolla"));
		
	}

	public boolean saveInformation(T obj) {

		if (obj instanceof Customer) {
			Customer customer = (Customer) obj;
			System.out.println(customer.getCustomerID());
			customerMap.put(customer.getCustomerID(), customer);
			System.out.println(customerMap.size());
			for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			return true;
		} else
			return false;
	}

	@Override
	public boolean deleteInformation(String id) {
		return 	customerMap.remove(id) != null? true:false;
		
	}

	@Override
	public List<Customer> getCustomerInformation() {

		List<Customer> customers = new ArrayList<>();
		for (Entry<String, Customer> customer : customerMap.entrySet()) {
			customers.add(customer.getValue());
		}
		for(Customer customer : customers){
			System.out.println(customer.getFirstName());
		}
		return customers;
	}



	@Override
	public Customer findUserById(String userId) {

		return customerMap.get(userId);
	}

	@Override
	public List<T> getInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateInformation(Customer customer) {
		
		Customer customertoUpdate = customerMap.get(customer.getCustomerID());
		
		customertoUpdate.setEmail(customer.getEmail());
		customertoUpdate.setFirstName(customer.getFirstName()); 
		customertoUpdate.setLastName(customer.getLastName());
		customertoUpdate.setLastName(customer.getUsername());
		
		customerMap.put(customertoUpdate.getCustomerID(), customertoUpdate);
		
		
		
		return customer;
	}

}
