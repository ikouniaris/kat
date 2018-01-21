package gr.hua.dit.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Entity;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gr.hua.dit.dao.adminDAO;
import gr.hua.dit.dao.customerDAO;
import gr.hua.dit.entities.Customer;
import gr.hua.dit.entities.Employee;

@Controller
@RequestMapping(value = "/SigninController")
public class SigninController extends HttpServlet{


	
	// inject the customer dao
    @Autowired
    private customerDAO customerDAOs;
    
 // inject the employee dao
    @Autowired
    private adminDAO admin;
    
    @RequestMapping(method = RequestMethod.POST)
    public String viewAttempt(HttpServletRequest request, Model model ) throws ServletException, IOException {
    	
    	System.out.println("Inside doPost method of SigninController\n");
    	//get form data
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	
    	
    	
			 // get employees from dao
	    	System.out.println("Inside loop of doPost method of SigninController\n");

	           List<Employee> employees = admin.printEmployees();	
	            
	           for(Employee e : employees) {
	        	   if(e.getUsername().equals(username) && e.getEmail().equals(password) && e.getPosition().equals("admin")){
						return "Admin";
	        	   }
	        	   else if (e.getUsername().equals(username) && e.getEmail().equals(password) && e.getPosition().equals("manager")){
						return "Manager";
					}else if(e.getUsername().equals(username) && e.getEmail().equals(password) && e.getPosition().equals("director")) {
						return "Director";
					}	
	            }
			return "Signin";
		}
	
    	
    	
    
    
	
	public String listCustomers(Model model) {
           
		// get customers from dao
        List<Customer> customers = customerDAOs.printCustomers();
            
        // add the customers to the model
        model.addAttribute("customers",customers);
            
        return "list-customers";
		
	}
	
}


//make it in case of error to redirect user to signin page with message

//renaem admindao to employee dao