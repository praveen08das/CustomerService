package com.java.customer.service.customerdto;

import com.java.customer.service.entity.Customer;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustometDto {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String name,email,mobile,pass;
}
