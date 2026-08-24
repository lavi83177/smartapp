package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.CustomerProfile;
import com.retail.smartapp.repo.CustomerProfileRepo;

@Service
public class CustomerProfileService {

    @Autowired
    private CustomerProfileRepo customerProfileRepo;

    // GET - Get All Customer Profiles
    public List<CustomerProfile> getAllCustomerProfile() {
        return customerProfileRepo.findAll();
    }

    // GET - Get Customer Profile By ID
    public Optional<CustomerProfile> getCustomerProfileById(Long id) {
        return customerProfileRepo.findById(id);
    }

    // POST - Create Customer Profile
    public CustomerProfile CreateCustomerProfile(CustomerProfile customerProfile) {
        return customerProfileRepo.save(customerProfile);
    }

    // PUT - Update Customer Profile
    public CustomerProfile updateCustomerProfile(
            Long id,
            CustomerProfile customerProfile) {

        CustomerProfile existingCustomerProfile =
                customerProfileRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Customer Profile not found with id: " + id));

        existingCustomerProfile.setTotalPurchase(
                customerProfile.getTotalPurchase());

        existingCustomerProfile.setTotalOrders(
                customerProfile.getTotalOrders());

        existingCustomerProfile.setCustomerSegment(
                customerProfile.getCustomerSegment());

        existingCustomerProfile.setLifetimeValue(
                customerProfile.getLifetimeValue());

        existingCustomerProfile.setLastPurchaseDate(
                customerProfile.getLastPurchaseDate());

        return customerProfileRepo.save(existingCustomerProfile);
    }

    // DELETE - Delete Customer Profile
    public void deleteCustomerProfile(Long id) {
        customerProfileRepo.deleteById(id);
    }
}