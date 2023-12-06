package com.java.customer.service.mapper;



import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.java.customer.service.customerdto.ProductDto;
import com.java.customer.service.entity.Customer;

@Mapper
public interface CustomerMapper extends BaseMapper<ProductDto,Customer>{
 
	CustomerMapper INSTANCE= Mappers.getMapper(CustomerMapper.class);
	 
}
