package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Payment;
import com.retail.smartapp.model.Product;
import com.retail.smartapp.repo.PaymentRepo;
import com.retail.smartapp.repo.ProductRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService {
	@Autowired
	private PaymentRepo paymentRepo;
	public List<Payment> getAllPayment(){
		return paymentRepo.findAll();
	}
	public Optional<Payment> getPaymentById(Long id){
		return paymentRepo.findById(id);
	}
	public Payment CreatePayment(Payment payment) {
		return paymentRepo.save(payment);
	}
	public void deletePayment(Long id) {
		paymentRepo.deleteById(id);
	}
	
}