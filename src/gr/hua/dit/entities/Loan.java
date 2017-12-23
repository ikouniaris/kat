package gr.hua.dit.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Loan {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loanID")
	private int loanID;
	
	@Column(name = "customerID")
	private int customerID;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "type_of_vehicle")
	private String vehicle;
	
	@Column(name = "duration_years")
	private int endurance;
	
	@Column(name = "Clearing_note")
	private String clearing;
	
	@Column(name = "State")
	private String state;

	public Loan() {	

	}
	
	public Loan(int loanID, int customerID, int amount, String vehicle, int endurance, String clearing, String state) {
		super();
		this.loanID = loanID;
		this.customerID = customerID;
		this.amount = amount;
		this.vehicle = vehicle;
		this.endurance = endurance;
		this.clearing=clearing;
		this.state=state;
	}

//loanID	
	public int getLoanID() {
		return loanID;
	}

	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}

//customerID	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

//amount	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

//vehicle	
	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

//endurance	
	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	
	
//Clearing	
		public String getClearing() {
			return clearing;
		}

		public void setClearing(String clearing) {
			this.clearing = clearing;
		}
	
//State
		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
}
