package com.example.demo.Controller;

import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public Customer saveCustomer(@RequestBody @Valid Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping
	public Iterable<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> get(@PathVariable("customerId") Integer customerId) {
        try {
            Customer customer = customerService.getCustomerById(customerId);
            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }
}
