package gr.hua.dit.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import gr.hua.dit.entities.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.dao.ManagerDAO;
import gr.hua.dit.entities.Employee;
import gr.hua.dit.entities.Loan;

@Component
@RequestMapping(value = "/ManagerController")
public class ManagerController {

	
	@Autowired
	private ManagerDAO manager;
	
	@RequestMapping( params="submitButton",  method = RequestMethod.POST)
    public String viewSubmitAttempt(HttpServletRequest request ) throws ServletException, IOException {
		
		System.out.println("Inside viewSubmitAttempt method of AdminController");
		return null;
	}
	
	
	@RequestMapping(params="checkButton",  method = RequestMethod.POST)
    public String viewSearchAttempt(@RequestParam("id") String id) {
		 if (manager.searchCustomer(id)==0) {
			 return "NewForm";
		 } else {return "Manager";}
		 
	}
	
	@RequestMapping(params="logoutButton",  method = RequestMethod.POST)
    public String logout(HttpServletRequest request ) throws ServletException, IOException {
  
		System.out.println("Inside logout method of AdminController");
		return "Signin";
	}
	
	
	
	@RequestMapping(params="submitLoan", method= RequestMethod.POST)
	public void newLoan(@ModelAttribute("loan") Loan tempLoan) {
		int result=1;
		
		
		
		
		return ;
	}
	
}
