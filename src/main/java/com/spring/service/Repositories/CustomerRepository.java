package com.spring.service.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.service.Models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
