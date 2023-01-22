package com.nathaniel.springdemo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nathaniel.springdemo.dao.CustomerDAO;
import com.nathaniel.springdemo.entity.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@ControllerAdvice
@RequestMapping("/customer")
public class CustomerController {
	
	// meed to inect hte customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customers from the dao
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		// add the customer to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
		
	}
}
