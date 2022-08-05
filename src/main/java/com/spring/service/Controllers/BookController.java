package com.spring.service.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.Models.Book;
import com.spring.service.Repositories.BookRepository;



@RestController
public class BookController {

	
	@Autowired(required=true)
    BookRepository bookRepository;

// Get All Books
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

// Add a new book
    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
	
// Update book
   @PutMapping("/updateBook{BookId}")
   public Book updateBook(@RequestBody int BookId) { 
	   
	   Book book; 
	   String title = ""; 
	   String firstName = ""; 
	   String lastname=""; 
	   int Rating=1;
	
	
   book=bookRepository.getReferenceById(BookId);
   
	    book.setTitle(title);
	    book.setAuthorFirstName(firstName);
	    book.setAuthorLastName(lastname);
	    book.setRating(Rating);
	    
	    return bookRepository.save(book);
   }
   
 // Delete Book
   @DeleteMapping("/deleteBook{BookId}")
   public List<Book> deleteBook(@RequestBody int BookId) {
	   bookRepository.deleteById(BookId);   
	  return bookRepository.findAll();
   }
}

