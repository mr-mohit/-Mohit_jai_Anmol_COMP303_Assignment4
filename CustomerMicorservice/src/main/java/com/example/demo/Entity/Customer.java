package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="customer")
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int fcustomerid;
	@Column(nullable = false)
	public String firstname;
	@Column(nullable = false)
	public String lastname;
	public String address;
	public String phone;
	@Column(nullable = false, unique = true)
	public String emailid;
	
	public Customer() {
		super();
		
	}

	public Customer(int fcustomerid, String firstname, String lastname, String address, String phone, String emailid) {
		super();
		this.fcustomerid = fcustomerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.emailid = emailid;
	}

	public int getFcustomerid() {
		return fcustomerid;
	}

	public void setFcustomerid(int fcustomerid) {
		this.fcustomerid = fcustomerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
}
