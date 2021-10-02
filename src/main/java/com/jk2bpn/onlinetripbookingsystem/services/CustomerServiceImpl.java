package com.jk2bpn.onlinetripbookingsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk2bpn.onlinetripbookingsystem.entities.Customer;
import com.jk2bpn.onlinetripbookingsystem.repository.ICustomerRepository;

@Service
public abstract class CustomerServiceImpl implements ICustomerService{
	@Autowired
    ICustomerRepository repo;
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		  System.out.println("Successfully saved");
		  return repo.save(customer);
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 System.out.println("Successfully updated");
		  return repo.save(customer);
	}

	@Override
	public String deleteCustomer(Long customerId) {
		// TODO Auto-generated method stub
		
		   repo.deleteById(customerId);
		   return "Successfully deleted";
	}

	
	@Override
	
	public Optional<Customer> viewCustomer(Long customerId) {
		// TODO Auto-generated method stub
		System.out.println("Successfully updated");
		  return repo.findById(customerId);
		
	}

	@Override
	
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}



	/*@Override
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}*/

	/*@Override
	public List<Customer> viewCustomerList(int customer) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
