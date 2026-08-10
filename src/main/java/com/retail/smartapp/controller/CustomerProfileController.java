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

    @GetMapping
    public List<CustomerProfile> getAllCustomerProfiles() {
        return customerProfileService.getAllCustomerProfile();
    }

    @GetMapping("/{id}")
    public Optional<CustomerProfile> getCustomerProfileById(@PathVariable Long id) {
        return customerProfileService.getCustomerProfileById(id);
    }

    @PostMapping
    public CustomerProfile saveCustomerProfile(
            @RequestBody CustomerProfile customerProfile) {
        return customerProfileService.CreateCustomerProfile(customerProfile);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomerProfile(@PathVariable Long id) {
        customerProfileService.deleteCustomerProfile(id);
        return "Customer Profile Deleted Successfully";
    }
}