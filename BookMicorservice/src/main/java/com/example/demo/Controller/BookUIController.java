package com.example.demo.Controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Book;
import com.example.demo.Service.BookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/book")
public class BookUIController {

	@Autowired
	private BookService bookService;
	
	  @RequestMapping(path = "/showBooks.html", method = RequestMethod.GET)
	    public String findAllBooks(Model model) {
		  try {
	        model.addAttribute("books", bookService.getBooks());
	        return "list-of-books";
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
			  return "Error occured.";
		  }
		  
		  
	
}
	  //GET
	    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
	    public String register(Model model) {
	      
	        return "add-book";
	    }
	  
	  //post
	    @RequestMapping(value = "registerBook", method = RequestMethod.POST)
	    @ResponseStatus(value = HttpStatus.OK)
	    public void  addBook(@ModelAttribute("book") Book book, HttpServletResponse response) throws Exception {    
	    	bookService.saveBook(book);
	        response.sendRedirect("/showBooks.html");

	    }
}
