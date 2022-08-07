package com.example.demo.Controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;
@Controller
@RequestMapping("/customer")
public class CustomerUIController {
	@Autowired
	private CustomerService customerService;
	
	  @RequestMapping(path = "/showCustomers", method = RequestMethod.GET)
	    public String findAllCustomers(Model model) {
		  try {
	        model.addAttribute("customers", customerService.getCustomers());
	        return "list-of-customers";
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
			  return "Error occured.";
		  }
	  }
	
	  
	  //GET
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String register(Model model) {
      
        return "register-customer";
    }
   //POST
    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void  addCustomer(@ModelAttribute("customer") Customer customer, HttpServletResponse response) throws Exception {
   
    	

   
    	customerService.saveCustomer(customer);
        response.sendRedirect("/listOfCustomers");
    }
  
    
}
