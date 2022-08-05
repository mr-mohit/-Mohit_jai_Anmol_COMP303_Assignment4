package com.spring.service.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.service.Models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Integer>{

}
