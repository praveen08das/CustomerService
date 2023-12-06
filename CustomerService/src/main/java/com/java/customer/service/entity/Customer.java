package com.java.customer.service.entity;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.UUID)
private String id;
private String name,email,mobile,pass;

//@Transient
//private List<Order> orders=new ArrayList<>();


	
}
