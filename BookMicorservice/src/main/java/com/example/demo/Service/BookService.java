package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}
	
	public Iterable<Book> getBooks(){
		return bookRepo.findAll();
	}
}
