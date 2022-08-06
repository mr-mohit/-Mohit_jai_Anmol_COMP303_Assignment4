package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="book")
public class Book {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookid")
	public int bookId;
	@Column(nullable = false)
	public String title;
	@Column(nullable = false)
	public String authorlastname;
	@Column(nullable = false)
	public String authorfirstname;
	@Column(nullable = false)
	public int rating;
	
	public Book() {
		super();
		
	}

	public Book(int bookId, String title, String authorlastname, String authorfirstname, int rating) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.authorlastname = authorlastname;
		this.authorfirstname = authorfirstname;
		this.rating = rating;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorlastname() {
		return authorlastname;
	}

	public void setAuthorlastname(String authorlastname) {
		this.authorlastname = authorlastname;
	}

	public String getAuthorfirstname() {
		return authorfirstname;
	}

	public void setAuthorfirstname(String authorfirstname) {
		this.authorfirstname = authorfirstname;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
