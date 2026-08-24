package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.Payment;
import com.retail.smartapp.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // GET - Get All Payments
    @GetMapping
    public List<Payment> getAllPayment() {
        return paymentService.getAllPayment();
    }

    // GET - Get Payment By ID
    @GetMapping("/{id}")
    public Optional<Payment> getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    // POST - Create Payment
    @PostMapping
    public Payment savePayment(@RequestBody Payment payment) {
        return paymentService.CreatePayment(payment);
    }

    // PUT - Update Payment
    @PutMapping("/{id}")
    public Payment updatePayment(
            @PathVariable Long id,
            @RequestBody Payment payment) {

        return paymentService.updatePayment(id, payment);
    }

    // DELETE - Delete Payment
    @DeleteMapping("/{id}")
    public String deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
        return "Payment Deleted Successfully";
    }
}