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
@Entity(name="TRAVELS")

public class Travels {
	
	public int getTravelsId() {
		return travelsId;
	}
	public void setTravelsId(int travelsId) {
		this.travelsId = travelsId;
	}
	public String getTravelsname() {
		return travelsname;
	}
	public void setTravelsname(String travelsname) {
		this.travelsname = travelsname;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	public List<TravelPackage> getTravelPackage() {
		return travelPackage;
	}
	public void setTravelPackage(List<TravelPackage> travelPackage) {
		this.travelPackage = travelPackage;
	}
	public Travels(int travelsId, String travelsname, String agentName, String address, String contact, List<Bus> bus,
			List<TravelPackage> travelPackage) {
		super();
		this.travelsId = travelsId;
		this.travelsname = travelsname;
		this.agentName = agentName;
		this.address = address;
		this.contact = contact;
		this.bus = bus;
		this.travelPackage = travelPackage;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TRAVELS_ID")
	int travelsId;
	String travelsname;
	String agentName;
	String address;
	String contact;
@OneToMany(cascade=CascadeType.ALL)
    
    @JoinColumn(name="BUS_ID")
    
    private List<Bus> bus;
@OneToMany(cascade=CascadeType.ALL)

@JoinColumn(name="PACKAGE_ID")

private List<TravelPackage> travelPackage;
	
}