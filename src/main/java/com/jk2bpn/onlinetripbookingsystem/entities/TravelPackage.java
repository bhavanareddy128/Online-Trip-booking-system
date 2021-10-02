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
@Entity(name="TRAVELPACKAGE")

public class TravelPackage {
	
	public TravelPackage(int packageId, String packageName, String packageDescription, String packageType,
			double packageCost, PaymentDetails paymentDetails, List<Hotel> hotel) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.paymentDetails = paymentDetails;
		this.hotel = hotel;
	}
	public List<Hotel> getHotel() {
		return hotel;
	}
	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}
	public void setPayment(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PACKAGE_ID")
	int packageId;
	String packageName;
	String packageDescription;
	String packageType;
	double packageCost;
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="PAYMENT_ID")

	PaymentDetails paymentDetails;
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageDescription() {
		return packageDescription;
	}
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public double getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="HOTEL_ID")
	private List<Hotel> hotel;
}