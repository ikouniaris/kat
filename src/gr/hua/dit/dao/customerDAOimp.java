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
public class customerDAOimp implements customerDAO {

	 @Autowired
     private SessionFactory sessionFactory;
	
	@Override
	public void insertCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public List<Customer> printCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();
        // create a query
        Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
        // execute the query and get the results list
        List<Customer> customers = query.getResultList();                        
        //return the results
        return customers;
	}

}
