package com.spring.service.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="customer")
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int FCustomerId;
	@Column(nullable = false)
	public String FirstName;
	@Column(nullable = false)
	public String LastName;
	public String Address;
	public String Phone;
	@Column(nullable = false, unique = true)
	public String EmailId;
	
	public Customer(int fCustomerId, String firstName, String lastName, String address, String phone, String emailId) {
		super();
		FCustomerId = fCustomerId;
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Phone = phone;
		EmailId = emailId;
	}
	public Customer() {
		super();
		
	}
	public int getFCustomerId() {
		return FCustomerId;
	}
	public void setFCustomerId(int fCustomerId) {
		FCustomerId = fCustomerId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
}
