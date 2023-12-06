package com.java.customer.service.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.java.customer.service.customerdto.ProductDto;
import com.java.customer.service.entity.Customer;



public interface CustomerService {
    public ResponseEntity<Object> getAllProduct(); 
    public Customer saveCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public Customer getCustomer(String custId);
   
}
