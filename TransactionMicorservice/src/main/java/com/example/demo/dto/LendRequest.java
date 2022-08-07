package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.dto.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LendRequest {

	Book book;
	int customerId;
	LocalDate trxndate;
	String trxntype;
}
