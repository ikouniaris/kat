package gr.hua.dit.dao;

import java.util.List;

import gr.hua.dit.entities.Customer;
import gr.hua.dit.entities.Employee;

public interface adminDAO {
	
//employees	
	public void insertEmployee(Employee e);
	
	public List<Employee> printEmployees();	
	
	public int modifyEmployee(Employee e, int employeeID);
	
	public int deleteEmployee(int id);	
//customers	
	public void insertCustomer(Customer c);
	
	public List<Customer> printCustomers();
	
	public void modifyCustomer();
}
