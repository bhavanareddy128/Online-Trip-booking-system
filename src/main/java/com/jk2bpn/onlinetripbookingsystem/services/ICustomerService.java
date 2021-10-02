package com.jk2bpn.onlinetripbookingsystem.services;
import java.util.List;
import java.util.Optional;

import com.jk2bpn.onlinetripbookingsystem.entities.Customer;

public interface ICustomerService {
public Customer addCustomer(Customer customer);
public Customer updateCustomer(Customer customer);
public String deleteCustomer(Long customerId);
//public Customer viewCustomer(int customer);
//public List<Customer> viewAllCustomers(int customer);
//public List<Customer> viewCustomerList(int customer);
Optional<Customer> viewCustomer(Long CustomerId);
public List<Customer> viewAllCustomers();
List<Customer> viewAllCustomer();
}
