package com.nathaniel.springdemo.dao;

import java.util.List;

import com.nathaniel.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
}
