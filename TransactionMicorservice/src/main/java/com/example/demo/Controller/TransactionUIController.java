package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Service.TransactionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/transactions")
public class TransactionUIController {

	@Autowired
	private TransactionService transactionService;
	
	
	  @RequestMapping(path = "/show-all-transaction", method = RequestMethod.GET)
	    public String findAllTransactions(Model model) {
		  try {
	       // model.addAttribute("transactions",getTransactions());
	        return "show-all-transaction";
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
			  return "Error occured.";
		  }
	  }
}
		  