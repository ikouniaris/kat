package gr.hua.dit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entities.Customer;




@Repository
public class ManagerDAOimp implements ManagerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public int searchCustomer(String id) {

			// get current hibernate session
	        Session currentSession = sessionFactory.getCurrentSession();
	        int result;
	        List<Customer> customers = printCustomers(); 
	        //check if employee exists
	        
	        for(Customer tempCustomer : customers) {
	        	String tempid=((Integer)tempCustomer.getCustomerID()).toString();
		        String tempname=tempCustomer.getFirstName()+" "+tempCustomer.getLastName();
		        if (tempid.equals(id) || tempname.equals(id)) {
		        		return 0;
	        	}
		        	else continue;
	        }
	        return -1;//this means that there is not that employee had he existed or there was an error in the data given result would be 0
	    
	}
	
	
	@Override
	@Transactional
	public List<Customer> printCustomers() {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
		List<Customer> customers = query.getResultList();
        return customers;
	}	
	
}
