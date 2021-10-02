package com.jk2bpn.onlinetripbookingsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="TICKETDETAILS")

public class TicketDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TICKET_ID")
	String ticketId;
	String status;
	
	public TicketDetails(String status, String ticketId) {
		super();
		this.status = status;
		this.ticketId = ticketId;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}	
}