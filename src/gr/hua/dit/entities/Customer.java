package gr.hua.dit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "customerID")
        private int customerID;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "afm")
        private String afm;
        
        @Column(name = "adt")
        private String adt;

        @Column(name = "phone_number")
        private String telephone;
        
//constructor        
        public Customer() {
                
        }
        
        
        public Customer(String firstName, String lastName, String afm, String adt, String telephone) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.afm = afm;
			this.adt = adt;
			this.telephone = telephone;
		}


		//customerID
        public int getCustomerID() {
                return customerID;
        }

        public void setCustomerID(int customerID) {
                this.customerID = customerID ;
        }
//firstname
        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }
//lastname
        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
//afm
        public String getAfm() {
                return afm;
        }

        public void setAfm(String afm) {
                this.afm = afm;
                
        }

//adt
        public String getAdt() {
            return adt;
    }

    public void setAdt(String adt) {
            this.adt = adt;
            
    }
//telephone        
    
    public String geTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;    
    }
//overrid toString method  
        @Override
        public String toString() {
                return "Customer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", afm=" +afm + " adt " + adt + " telephone " + telephone  + "]";
        }
        
}