package com.java.customer.service.fiegnclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.customer.service.customerdto.ProductDto;



@FeignClient(value = "super-admin", url = "http://localhost:9191")
public interface APIClient {
    @GetMapping(value = "/product/getAllProductDetails")
    public ResponseEntity<Object> getAllProduct();
}