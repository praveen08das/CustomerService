package com.java.customer.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.customer.service.customerdto.ProductDto;
import com.java.customer.service.entity.Customer;
import com.java.customer.service.helper.ResponseHandler;
import com.java.customer.service.services.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping(value = "/get_allproducts")
	public ResponseEntity<Object> findAllProductById() {
		 ResponseEntity<Object> allProduct = service.getAllProduct();
		if (allProduct != null) {
			return ResponseHandler.generateResponse(HttpStatus.OK, true, "sucess", allProduct);
		}
		return ResponseHandler.generateResponse(HttpStatus.NOT_FOUND, false, "failed", allProduct);

	}
	
	
@PostMapping("/saveCustomer")	
public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer)
{
	Customer customer2=service.saveCustomer(customer);
	return ResponseEntity.status(HttpStatus.CREATED).body(customer2);
}
 	

@GetMapping("/find/{custId}")
public ResponseEntity<Customer> getCustomer(@PathVariable String custId)
{
	Customer customer=service.getCustomer(custId);	
	return ResponseEntity.ok(customer);
}


@GetMapping("/getAllCustomer")
public  List<Customer> getAllCustomer()
{
	return service.getAllCustomer();	
}




}
