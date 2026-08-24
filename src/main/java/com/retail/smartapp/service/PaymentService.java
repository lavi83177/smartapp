package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Payment;
import com.retail.smartapp.repo.PaymentRepo;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    // GET - Get All Payments
    public List<Payment> getAllPayment() {
        return paymentRepo.findAll();
    }

    // GET - Get Payment By ID
    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepo.findById(id);
    }

    // POST - Create Payment
    public Payment CreatePayment(Payment payment) {
        return paymentRepo.save(payment);
    }

    // PUT - Update Payment
    public Payment updatePayment(Long id, Payment payment) {

        Payment existingPayment = paymentRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Payment not found with id: " + id));

        existingPayment.setPaymentMethod(payment.getPaymentMethod());
        existingPayment.setPaymentStatus(payment.getPaymentStatus());
        existingPayment.setTransactionId(payment.getTransactionId());
        existingPayment.setPaymentDate(payment.getPaymentDate());
        existingPayment.setAmount(payment.getAmount());

        return paymentRepo.save(existingPayment);
    }

    // DELETE - Delete Payment
    public void deletePayment(Long id) {
        paymentRepo.deleteById(id);
    }
}