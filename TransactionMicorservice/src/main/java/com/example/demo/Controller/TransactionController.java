package com.example.demo.Controller;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Transaction;
import com.example.demo.Service.TransactionService;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.OK)
	public Transaction saveTransaction(@RequestBody Transaction transaction) {
		return transactionService.saveTransaction(transaction);
	}

	@GetMapping
	public Iterable<Transaction> getTransactions(){
		return transactionService.getTransactions();
	}
	
    @GetMapping("/{transactionid}")
    public ResponseEntity<Transaction> get(@PathVariable("transactionId") Integer transactionid) {
        try {
            Transaction transaction = transactionService.getTransactionById(transactionid);
            return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Transaction>(HttpStatus.NOT_FOUND);
        }
    }
	
	@PutMapping(path="/{transactionId}")
	public ResponseEntity<?> UpdateTransactionById(@PathVariable("transactionId") int transactionId, @RequestBody Transaction transaction) throws Exception {
		try {
			Transaction currentTransaction = transactionService.getTransactionById(transactionId);
		transaction.setTransactionid(transactionId);
		transactionService.saveTransaction(transaction);
		return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
    @DeleteMapping("/{transactionId}")
    public void delete(@PathVariable("transactionId") Integer transactionId) {

        transactionService.deleteTransaction(transactionId);
    }
}
