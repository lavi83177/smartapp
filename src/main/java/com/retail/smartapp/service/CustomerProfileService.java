package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.CustomerProfile;
import com.retail.smartapp.model.Inventory;
import com.retail.smartapp.repo.CustomerProfileRepo;
import com.retail.smartapp.repo.InventoryRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerProfileService {
	@Autowired
	private CustomerProfileRepo customerProfileRepo;
	public List<CustomerProfile> getAllCustomerProfile(){
		return customerProfileRepo.findAll();
	}
	public Optional<CustomerProfile> getCustomerProfileById(Long id){
		return customerProfileRepo.findById(id);
	}
	public CustomerProfile CreateCustomerProfile(CustomerProfile customerProfile) {
		return customerProfileRepo.save(customerProfile);
	}
	public void deleteCustomerProfile(Long id) {
		customerProfileRepo.deleteById(id);
	}
}