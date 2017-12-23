package gr.hua.dit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeID")
	private int employeeID;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "last_name")
	private String lastname;
	
	@Column(name = "user_name")
	private String username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "position")
	private String position;
	
//constructors	
	public Employee() {
		
	}
	
	public Employee(String firstname, String lastname, String username,  String email, String department, String position) {
		super();
		//employeeID not used
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.department = department;
		this.position = position;
	}
	
	//employeeID	
		public int getEmployeeID() {
			return employeeID;
		}
	
//username	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

//department
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

//position	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

//firstname		
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

//lastname
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

//email	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
