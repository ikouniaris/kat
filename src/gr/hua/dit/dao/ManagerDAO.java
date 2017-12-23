package gr.hua.dit.dao;

import java.util.List;

import gr.hua.dit.entities.Customer;
import gr.hua.dit.entities.Employee;

public interface ManagerDAO {
	public int searchCustomer(String id);
	
	public List<Customer> printCustomers();
}
