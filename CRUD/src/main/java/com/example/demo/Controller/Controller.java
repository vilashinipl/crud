package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CustomerModel.CustomerDetails;
import com.example.demo.CustomerService.CustomerServes;

@RestController
@RequestMapping("/customer")
public class Controller {
	@Autowired
	CustomerServes cusservice;
	@PostMapping(" ")
	public String create(@RequestBody CustomerDetails customer)
	{
		return cusservice.addCustomer(customer);
	}
	@GetMapping(" ")
	public List<CustomerDetails> read()
	{
		return cusservice.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional<CustomerDetails> readById(@PathVariable int id)
	{
		return cusservice.getCustomerById(id);
	}
}