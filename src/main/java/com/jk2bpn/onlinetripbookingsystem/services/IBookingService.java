package com.jk2bpn.onlinetripbookingsystem.services;
import java.util.List;
import java.util.Optional;

import com.jk2bpn.onlinetripbookingsystem.entities.Booking;

public interface IBookingService {
	
	Booking makeBooking(Booking booking);
	String cancelBooking(Long bookingId);
	Optional<Booking> viewBooking(Long bookingId);
	List<Booking> viewAllBookings();
}
