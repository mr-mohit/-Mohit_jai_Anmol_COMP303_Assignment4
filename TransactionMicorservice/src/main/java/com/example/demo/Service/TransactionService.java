package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Transaction;
import com.example.demo.Repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepo;

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
	

}
