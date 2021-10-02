package com.jk2bpn.onlinetripbookingsystem.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="PAYMENTDETAILS")
public class PaymentDetails {

String status;
@Id
@GeneratedValue(strategy= GenerationType.AUTO)

@Column(name="PAYMENT_ID")
String paymentId;

public PaymentDetails(String status, String paymentId) {
	super();
	this.status = status;
	this.paymentId = paymentId;
}
public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getPaymentId() {
	return paymentId;
}

public void setPaymentId(String paymentId) {
	this.paymentId = paymentId;
}



}