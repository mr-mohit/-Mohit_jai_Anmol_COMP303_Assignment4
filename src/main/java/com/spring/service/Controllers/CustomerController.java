package com.spring.service.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.Models.Customer;
import com.spring.service.Repositories.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired(required=true)
    CustomerRepository customerRepository;

// Get All customers
    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

// Add a new customer
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
	
// Update customer
   @PutMapping("/updateCustomer{CustomerId}")
   public Customer updateCustomer(@RequestBody int CustomerId) { 
	   
	   Customer customer; 
	   String email =""; 
	   String firstName = ""; 
	   String lastname=""; 
	   String address="";
	   String phone="";
	
	
   customer=customerRepository.getReferenceById(CustomerId);
   
	    customer.setAddress(address);
	    customer.setEmailId(email);
	    customer.setFirstName(firstName);
	    customer.setLastName(lastname);
	    customer.setPhone(phone);
	    
	    return customerRepository.save(customer);
   }
   
 // Delete Customer
   @DeleteMapping("/deleteBook{CustomerId}")
   public List<Customer> deleteBook(@RequestBody int CustomerId) {
	   customerRepository.deleteById(CustomerId);   
	  return customerRepository.findAll();
   }

}
