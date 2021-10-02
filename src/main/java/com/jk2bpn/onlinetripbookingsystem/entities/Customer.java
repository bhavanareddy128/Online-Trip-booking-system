package com.jk2bpn.onlinetripbookingsystem.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity(name="CUSTOMER")
public class Customer {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "CUSTOMER_ID")
	    private int customerId;

	    @Column(name = "CUSTOMERNAME")
	    private String customerName;

	    @Column(name = "ADDRESS")
	    private String address;
	    
	    @Column(name = "EMAIL")
	    private String email;
	    
	    @Column(name = "MOBILE")
	    private String mobileNo;

	    @OneToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name="USER_ID")
	    private User userId;
	    
	    
	     String customerPassword;
	    
	    @OneToMany(cascade=CascadeType.ALL)
	    
	    @JoinColumn(name="FEEDBACK_ID")
	    
	    private List<Feedback> feedback;
	
	public User getUserId() {
			return userId;
		}
		public void setUserId(User userId) {
			this.userId = userId;
		}
		public List<Feedback> getFeedback() {
			return feedback;
		}
		public void setFeedback(List<Feedback> feedback) {
			this.feedback = feedback;
		}
	public Customer(int customerId, String customerName, String address, String email, String mobileNo, User userId,
				String customerPassword, List<Feedback> feedback) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.address = address;
			this.email = email;
			this.mobileNo = mobileNo;
			this.userId = userId;
			this.customerPassword = customerPassword;
			this.feedback = feedback;
		}
	/*int customerId;
	String customerName;
	String customerPassword;
	String address;
	String mobileNo;
	String email;*/
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
