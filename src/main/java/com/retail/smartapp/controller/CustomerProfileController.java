package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.CustomerProfile;
import com.retail.smartapp.service.CustomerProfileService;

@RestController
@RequestMapping("/customer-profiles")
public class CustomerProfileController {

    @Autowired
    private CustomerProfileService customerProfileService;

    // GET - Get All Customer Profiles
    @GetMapping
    public List<CustomerProfile> getAllCustomerProfiles() {
        return customerProfileService.getAllCustomerProfile();
    }

    // GET - Get Customer Profile By ID
    @GetMapping("/{id}")
    public Optional<CustomerProfile> getCustomerProfileById(
            @PathVariable Long id) {
        return customerProfileService.getCustomerProfileById(id);
    }

    // POST - Create Customer Profile
    @PostMapping
    public CustomerProfile saveCustomerProfile(
            @RequestBody CustomerProfile customerProfile) {

        return customerProfileService.CreateCustomerProfile(customerProfile);
    }

    // PUT - Update Customer Profile
    @PutMapping("/{id}")
    public CustomerProfile updateCustomerProfile(
            @PathVariable Long id,
            @RequestBody CustomerProfile customerProfile) {

        return customerProfileService.updateCustomerProfile(id, customerProfile);
    }

    // DELETE - Delete Customer Profile
    @DeleteMapping("/{id}")
    public String deleteCustomerProfile(@PathVariable Long id) {
        customerProfileService.deleteCustomerProfile(id);
        return "Customer Profile Deleted Successfully";
    }
}