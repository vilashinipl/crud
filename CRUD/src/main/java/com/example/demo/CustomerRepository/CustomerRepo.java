package com.example.demo.CustomerRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.CustomerModel.CustomerDetails;

public interface CustomerRepo extends JpaRepository<CustomerDetails,Integer>
{
	
}
