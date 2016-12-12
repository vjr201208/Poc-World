package com.poc.rest.springboot.service;

import com.poc.rest.springboot.domain.Customer;

import java.util.List;

/** CustomerService class is acts delegate serve the request and response to the controller class with in enterprise application. */
public interface CustomerService {

    Customer getCustomerById(String customerId);

    List<Customer> getAllCustomers();

}
