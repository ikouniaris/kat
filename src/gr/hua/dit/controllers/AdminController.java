package gr.hua.dit.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.dao.adminDAO;
import gr.hua.dit.entities.Customer;
import gr.hua.dit.entities.Employee;

@Component
@RequestMapping(value = "/AdminController")
public class AdminController {

	@Autowired
    private adminDAO admin; 
    
	@RequestMapping( params="addButton",  method = RequestMethod.POST)
    public String viewSubmitAttempt(@ModelAttribute("employee") Employee employee) throws ServletException, IOException {		
	
        System.out.println(""+employee.getFirstname() +" "+ employee.getLastname() +" "+ employee.getUsername()  +" "+ employee.getEmail() +" "+ employee.getDepartment() + ""+ employee.getPosition());

        admin.insertEmployee(employee);
  		
		return "Admin";
	}
	
	
	@RequestMapping( params="modifyButton",  method = RequestMethod.POST)
    public String viewModifyAttempt(@ModelAttribute("employee") Employee employee, @RequestParam("employeeID")int employeeID ) throws ServletException, IOException {
		int result;
		System.out.println("Inside viewModifyAttempt method of AdminController");
        System.out.println(""+employee.getFirstname() +" "+ employee.getLastname() +" "+ employee.getUsername()  +" "+ employee.getEmail() +" "+ employee.getDepartment() + " "+ employee.getPosition());

        System.out.println(employeeID);
		result = admin.modifyEmployee(employee,employeeID);
		if(result > 0) {
			System.out.println("Delete successful!\n");
		}else if(result == 0) {
			System.out.println("Something went wrong with the procedure!\n");
		}else {
			System.out.println("Employee not found!\n");
		}
		return "Admin";
	}
	
	@RequestMapping( params="viewCustomers",  method = RequestMethod.POST)
	public String viewUsers(Model model) {
		
		
		// get customers from dao
        List<Employee> employees = admin.printEmployees();
        
        System.out.println("getting inside for loop\n");
        for(Employee e: employees) {
        	System.out.println(e.getEmployeeID()+"\n");
        }
        
        // add the customers to the model
        model.addAttribute("employees",employees);
		System.out.println("Redirecting to List.jsp\n");
        return "List";
	}
	
	@RequestMapping( params="deleteButton",  method = RequestMethod.POST)
	public void Delete(@RequestParam("id")int id){
		int result;
		System.out.println("Inside delete method of adminController\n");
		
		System.out.println(id);
		System.out.println("Inside delete method of adminController\n");
		result = admin.deleteEmployee(id);
		
		if(result > 0) {
			System.out.println("Delete successful!\n");
		}else if(result == 0) {
			System.out.println("Something went wrong with the procedure!\n");
		}else {
			System.out.println("Employee not found!\n");
		}
	}
	
	//admin wants to log out
	@RequestMapping( params="logoutButton",  method = RequestMethod.POST)
    public String Logout() throws ServletException, IOException {
		return "Signin";		
	}
}
