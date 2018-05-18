package com.nitish.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nitish.spring.model.Address;
import com.nitish.spring.model.Customer;
import com.nitish.spring.model.Order;
import com.nitish.spring.model.Product;
import com.nitish.spring.services.ProductServices;
import com.nitish.spring.services.Services;

@Controller
public class CustomerController {

	@Autowired
	Services services;

	@RequestMapping(value = "/")
	public String printWelcome() {
		// System.out.println("In Welcome");
		return "hello";

	}

	@RequestMapping(value = "/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/customer")
	public String addCustomer() {
		return "customer";
	}

	@RequestMapping(value = "/order")
	public String addOrder() {
		return "Order";
	}

	@RequestMapping(value = "/product")
	public String addProduct() {
		return "Product";
	}

	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public String userLogin(HttpServletRequest request, Model model) {
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		Customer customer = new Customer();
		customer.setUsername(username);
		customer.setPassword(password);
		//
		// System.out.println(customer.getUsername());
		// System.out.println(customer.getPassword());

		model.addAttribute("login credentials", customer);
		return "home";
	}

	@RequestMapping(value = "/register")
	public String userLogin(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "register";
	}

	@RequestMapping(value = "/processRegistration", method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("customer") Customer customer) {

		services.addUser(customer);

		// System.out.println("Customer Name : " + customer.getFirstName() + " "
		// + customer.getLastName());
		return "home";

	}

	@RequestMapping(value = "/addcustomer", method = RequestMethod.POST)
	public ModelAndView addCustomer(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("customerinfo");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		Customer customer = new Customer(firstName, lastName, email);
		String address = request.getParameter("billingStreet");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String zipCode = request.getParameter("billingZip");
		Address billingAddress = new Address(address, city, state, country, zipCode);
		customer.setAddress(billingAddress);
		// System.out.println(customer);
		model.addObject("StoredCustomer", customer);

		return model;
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public ModelAndView addOrder(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("productinfo");
		String productName = request.getParameter("productName");
		String productDescription = request.getParameter("productDescription");
		String price = request.getParameter("price");

		Product product = new Product(productName, productDescription, price);
		model.addObject("Product", product);
		return model;
	}

	@RequestMapping(value = "/addOrder", method = RequestMethod.GET)
	public ModelAndView addProduct(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("orderinfo");
		String productName = request.getParameter("productName");
		String customerName = request.getParameter("customerName");
		String quantity = request.getParameter("quantity");

		Order order = new Order(productName, customerName, quantity);
		model.addObject("Order", order);
		return model;
	}

	@RequestMapping(value = "/showcustomers")
	public ModelAndView showCustomers() {
		ModelAndView modelAndView = new ModelAndView("allcustomers");
		System.out.println("in show customers");
		List<Customer> customers = services.loadUsers();
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerID());
		}
		modelAndView.addObject("list", services.loadUsers());
		return modelAndView;
	}

	@RequestMapping(value = "/delete")
	public ModelAndView deleteCustomer(@RequestParam("id") String id) {

		boolean success = services.deleteUser(id);
		System.out.println("Success" + success);
		ModelAndView modelAndView = new ModelAndView("allcustomers");
		modelAndView.addObject("list", services.loadUsers());
		return modelAndView;

	}
	
	@RequestMapping(value = "/update")
	public ModelAndView updateCustomer(@RequestParam("id") String id) {

//		Customer customer = services.loadUserById(id);
		Customer customer = new Customer();
		customer.setCustomerID(id);
		//print on page
		ModelAndView modelAndView = new ModelAndView("updatecustomer");
		
		modelAndView.addObject("updatecustomer", customer);
		return modelAndView;

	}
	@RequestMapping(value = "/updateDAO")
	public ModelAndView updateCustomer(@ModelAttribute("updatecustomer") Customer customer){
		
		System.out.println("Customer id to update : "+ customer.getCustomerID());
		services.updateUser(customer);
		ModelAndView modelAndView = new ModelAndView("allcustomers");
		modelAndView.addObject("list", services.loadUsers());
		return modelAndView;
	}

}
