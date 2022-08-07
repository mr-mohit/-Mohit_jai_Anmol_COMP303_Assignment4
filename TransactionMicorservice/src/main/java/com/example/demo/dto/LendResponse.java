package com.example.demo.dto;

import com.example.demo.Entity.Transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LendResponse {

	Book book;
	Customer customer;
	String transactionType;
}
