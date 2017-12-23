package gr.hua.dit.dao;

import java.util.List;
import gr.hua.dit.entities.Customer;

public interface customerDAO {

	public void insertCustomer();
	 
	public void updateCustomer();
	
	public void deleteCustomer();
		
	public List<Customer> printCustomers();	
}
