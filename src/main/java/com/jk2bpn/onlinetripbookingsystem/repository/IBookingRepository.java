package com.jk2bpn.onlinetripbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk2bpn.onlinetripbookingsystem.entities.Booking;

public interface IBookingRepository extends JpaRepository<Booking ,Long>{

}
