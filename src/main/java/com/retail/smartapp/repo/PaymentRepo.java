package com.retail.smartapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.smartapp.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {

}
