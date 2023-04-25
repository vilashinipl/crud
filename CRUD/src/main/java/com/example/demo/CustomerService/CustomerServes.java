package com.example.demo.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CustomerModel.CustomerDetails;
import com.example.demo.CustomerRepository.CustomerRepo;

@Service
public class CustomerServes {
	@Autowired
	CustomerRepo repository;
	public String addCustomer(CustomerDetails customer)
	{
		repository.save(customer);
		return "Added Successfully";
	}
	public List<CustomerDetails> getCustomer()
	{
		return repository.findAll();
	}
	public Optional<CustomerDetails> getCustomerById(int id)
	{
		return repository.findById(id);
	}
}
