package com.java.customer.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.customer.service.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String>{

}
