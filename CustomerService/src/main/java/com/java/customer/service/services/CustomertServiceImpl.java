package com.java.customer.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.customer.service.customerdto.ProductDto;
import com.java.customer.service.entity.Customer;
import com.java.customer.service.fiegnclient.APIClient;
import com.java.customer.service.repo.CustomerRepo;
@Service
public class CustomertServiceImpl implements CustomerService{
     
	@Autowired
	private APIClient apiClient;
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public ResponseEntity<Object> getAllProduct() {
		// TODO Auto-generated method stub
		 ResponseEntity<Object> allProduct = apiClient.getAllProduct();

		return allProduct;
	}
     
//	@Autowired
//	public OrderClient client;
//	
	

	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {

		return customerRepo.findAll();
	}

	@Override
	public Customer getCustomer(String custId) {
		return customerRepo.findById(custId).orElseThrow();
	}

	


}
