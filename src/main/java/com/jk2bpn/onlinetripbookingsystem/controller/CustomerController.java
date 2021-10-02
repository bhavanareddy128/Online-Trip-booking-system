package com.jk2bpn.onlinetripbookingsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jk2bpn.onlinetripbookingsystem.entities.Customer;
import com.jk2bpn.onlinetripbookingsystem.services.ICustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	ICustomerService cservice;
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return cservice.addCustomer(customer);
	}
	@PutMapping("/updatecustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return cservice.updateCustomer(customer);
	}
	@DeleteMapping("/deletecustomer/{customer Id}")
	//public Customer deleteCustomer(@RequestBody Customer customer) 
	public String deleteCustomer(@PathVariable Long customerId) {
		return cservice.deleteCustomer(customerId);
	}
	@GetMapping("/viewcustomer/{customer Id}")
	//public Customer viewCustomer(@RequestBody int customerId){
	public Optional<Customer> viewCustomer(@PathVariable Long customerId){
		return cservice.viewCustomer(customerId);
		
	}
	@GetMapping("/viewallcustomer")
	//public List<Customer> viewAllCustomer(@RequestBody int customerId){
	public List<Customer> viewAllCustomer(){
		return cservice.viewAllCustomers();
		
	}
	/*@GetMapping("/viewcustomerlist")
	public List<Customer> viewCustomerList(@RequestBody int customerId){
		return cservice.viewCustomerList(customerId);
		
	}*/
}
