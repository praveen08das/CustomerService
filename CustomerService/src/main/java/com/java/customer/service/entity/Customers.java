package com.java.customer.service.entity;

import java.sql.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String  userCode;
    private String businessName;
    private String ownerName;
    private  String phoneNo;
    private String phoneStatus;
    private String email;
    private String password;
    private String emailStatus;
    private String country;
    private String state;
    private String district;
    private String pinCode;
    private String area;
    private String  panNo;
    private  String addharNo;
    private String gstNo;
    private String tradeLicenseNo;
    private String bankNo;
    private String accountNo;
    private String ifscCode;
    private String panImage;
    private String addharImage;
    private String gstImage;
    private String tradeLicenseImage;
    private String status;
    private String  passwordStatus;
    private String roll;
    private Date created_at;
    private Date updated_at;
}
