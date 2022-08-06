package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="transaction")
public class Transaction {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int transactionid;
	@Column(nullable = false)
	public int customerid;
	@Column(nullable = false)
	public int bookid;
	@Column(nullable = false)
	public String trxndate;
	@Column(nullable = false)
	public String trxntype;
	
	public Transaction() {
		super();
		
	}

	public Transaction(int transactionid, int customerid, int bookid, String trxndate, String trxntype) {
		super();
		this.transactionid = transactionid;
		this.customerid = customerid;
		this.bookid = bookid;
		this.trxndate = trxndate;
		this.trxntype = trxntype;
	}

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTrxndate() {
		return trxndate;
	}

	public void setTrxndate(String trxndate) {
		this.trxndate = trxndate;
	}

	public String getTrxntype() {
		return trxntype;
	}

	public void setTrxntype(String trxntype) {
		this.trxntype = trxntype;
	}


}
