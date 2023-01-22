package com.nathaniel.springdemo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@ControllerAdvice
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		return "list-customers";
		
	}
}
