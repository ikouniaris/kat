 package gr.hua.dit.controllers;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import gr.hua.dit.dao.customerDAO;
import gr.hua.dit.entities.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@RequestMapping("/customer")
public class customerController {
	
	// inject the customer dao
    @Autowired
    private customerDAO customerDAOs;
	
	@RequestMapping("/list")
		public String listCustomers(Model model) {
            
            // get customers from dao
            List<Customer> customers = customerDAOs.printCustomers();
            
            // add the customers to the model
            model.addAttribute("customers",customers);
            
            return "list-customers";
		
	}

}
