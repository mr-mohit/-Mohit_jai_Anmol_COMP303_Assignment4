package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.Transaction;
import com.example.demo.Repository.TransactionRepository;
import com.example.demo.dto.Book;
import com.example.demo.dto.Customer;
import com.example.demo.dto.LendRequest;
import com.example.demo.dto.LendResponse;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepo;
	@Autowired
	private RestTemplate resttemplate;

	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepo.save(transaction);
	}
	
	public Transaction getTransactionById(Integer transactionId) {
		return transactionRepo.findById(transactionId).get();
	}
	
	public Iterable<Transaction> getTransactions(){
		return transactionRepo.findAll();
	}
	
	public void deleteTransaction(Integer transactionId) {
		transactionRepo.deleteById(transactionId);
	}

	public Iterable<Transaction> getLentBooks(String trxntype) {
		return transactionRepo.findBytrxntype(trxntype);
		
	}
	
	public LendResponse saveLentBook(LendRequest request) {
		Book book = request.getBook();
		//Customer customer = resttemplate.getForObject("http://Customer-Service/api/customer/"+request.getCustomerId(), null);
		
		return null;
	}

}
