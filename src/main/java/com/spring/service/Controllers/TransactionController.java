package com.spring.service.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.Models.Transaction;
import com.spring.service.Repositories.TransactionRepository;


@RestController
public class TransactionController {

	@Autowired(required=true)
    TransactionRepository transactionRepository;

// Get All Transactions
    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

// Add a new Transaction
    @PostMapping("/addTransaction")
    public Transaction addBook(@RequestBody Transaction transaction, String CustomerId, String BookId) {
        return transactionRepository.save(transaction);
    }
}
	