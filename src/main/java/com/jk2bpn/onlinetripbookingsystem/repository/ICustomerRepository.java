package com.jk2bpn.onlinetripbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk2bpn.onlinetripbookingsystem.entities.Customer;


public interface ICustomerRepository extends JpaRepository<Customer ,Long>{

}
