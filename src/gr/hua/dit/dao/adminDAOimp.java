package gr.hua.dit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entities.Customer;
import gr.hua.dit.entities.Employee;

@Repository
public class adminDAOimp implements adminDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
//employee	
	@Override
	@Transactional
	public void insertEmployee(Employee e) {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        List<Employee> employees = printEmployees(); 
        //check if employee exists
        for(Employee searchEmployee : employees) {
        	if( searchEmployee.getFirstname().equals(e.getFirstname()) && searchEmployee.getLastname().equals(e.getLastname()) ) {
        		System.out.println("Employee already exists!\n");
        		return;
        	}
        }
        currentSession.save(e);
        
	}

	@Override
	@Transactional
	public List<Employee> printEmployees() {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> employees = query.getResultList();
        return employees;
	}	
	
	@Override
	@Transactional
	public int modifyEmployee (Employee e, int employeeID) {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        int result;
        List<Employee> employees = printEmployees(); 
        //check if employee exists
        
        for(Employee searchEmployee : employees) {
        	if( searchEmployee.getEmployeeID() == employeeID) {
        		System.out.println("Employee found!\n");
        		//create query
        		Query query = currentSession.createQuery("UPDATE Employee set first_name= :firstname, last_name= :lastname, user_name= :username, email= :email, department= :department, position= :position where employeeID= :employeeID");
                
                query.setParameter("firstname", e.getFirstname());
                query.setParameter("lastname", e.getLastname());
                query.setParameter("username", e.getUsername());
                query.setParameter("email", e.getEmail());
                query.setParameter("department", e.getDepartment());
                query.setParameter("position", e.getPosition());
                query.setParameter("employeeID", employeeID);
                
                result = query.executeUpdate();
                System.out.println("Rows affected: " + result);
                return result;
        	}
        }
        return -1;//this means that there is not that employee had he existed or there was an error in the data given result would be 0
    }

	@Override
	@Transactional
	public int deleteEmployee(int id) {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        List<Employee> employees = printEmployees(); 
        //check if employee exists
        for(Employee searchEmployee : employees) {
        	if( searchEmployee.getEmployeeID() == id ) {
        		System.out.println("Employee found!\n");
        		Query query = currentSession.createQuery("delete Employees where employeeID = :id");
                query.setParameter("id", id);
                int result = query.executeUpdate();
                return result;
        	}
        }
        return -1;
	}
	
//customer	
	@Override
	@Transactional

	public void insertCustomer(Customer c) {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

	}

	@Override
	@Transactional

	public List<Customer> printCustomers() {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
		return null;
	}

	@Override
	@Transactional
	public void modifyCustomer() {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

	}

}
