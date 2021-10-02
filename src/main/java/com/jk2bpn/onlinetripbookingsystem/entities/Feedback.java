package com.jk2bpn.onlinetripbookingsystem.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity(name="FEEDBACK")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FEEDBACK_ID")
	String feedbackId;
	String feedback;
	int rating;
	LocalDate submitDate;
	public String getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public LocalDate getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(LocalDate submitDate) {
		this.submitDate = submitDate;
	}
	
	public Feedback(String feedbackId, String feedback, int rating, LocalDate submitDate, Customer customer) {
		super();
		this.feedbackId = feedbackId;
		this.feedback = feedback;
		this.rating = rating;
		this.submitDate = submitDate;
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="CUSTOMER_ID")
	private Customer customer;
	
	
	
}
