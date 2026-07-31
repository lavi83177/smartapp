package com.retail.smartapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.smartapp.model.CustomerProfile;

@Repository
public interface CustomerProfileRepo extends JpaRepository<CustomerProfile, Long> {

}