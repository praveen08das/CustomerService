package com.java.customer.service.customerdto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto {
       @JsonIgnore
	   private String id;
	   
	   @NotEmpty(message = "Product Name is required")
	   @Size(min =5 ,max=25 ,message = "min 5 and max 25 character is allowed....")
	   private String productName;
	   
	   
	   @NotEmpty(message = "productCode Name is required")
	   @Size(min =5 ,max=10 ,message = "min 5 and max 10 character is allowed....")
	   private String productCode;
	   
	   @NotEmpty(message = "productCode Name is required")
	   @Size(min =5 ,max=10 ,message = "min 5 and max 10 character is allowed....")
	   private String productDesc;
	   
	   @NotEmpty(message = "Title is required")
	   @Size(min =5 ,max=10 ,message = "min 5 and max 10 character is allowed....")
	   private String title;
       
	  
	   
	   @DecimalMin(value = "0.01",message = "min 0.01 value is allowed....")
	   @DecimalMax(value = "1000.01",message = "max 1000.01 value is allowed....")
	   private double price;
	   
	   @NotEmpty(message = "Roll of product is required")
	   private String roll;
   
   
}
