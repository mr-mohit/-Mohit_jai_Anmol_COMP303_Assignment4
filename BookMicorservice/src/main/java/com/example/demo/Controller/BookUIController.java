package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
}
