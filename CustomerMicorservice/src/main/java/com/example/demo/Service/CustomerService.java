package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public Iterable<Customer> getCustomers(){
		return customerRepo.findAll();
	}
}
