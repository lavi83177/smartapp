package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Order;
import com.retail.smartapp.repo.OrderRepo;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    // GET - Get All Orders
    public List<Order> getAllOrder() {
        return orderRepo.findAll();
    }

    // GET - Get Order By ID
    public Optional<Order> getOrderById(Long id) {
        return orderRepo.findById(id);
    }

    // POST - Create Order
    public Order CreateOrder(Order order) {
        return orderRepo.save(order);
    }

    // PUT - Update Order
    public Order updateOrder(Long id, Order order) {

        Order existingOrder = orderRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Order not found with id: " + id));

        existingOrder.setTotalPurchase(order.getTotalPurchase());
        existingOrder.setOrderStatus(order.getOrderStatus());
        existingOrder.setPaymentStatus(order.getPaymentStatus());
        existingOrder.setShippingAddress(order.getShippingAddress());
        existingOrder.setOrderDate(order.getOrderDate());

        return orderRepo.save(existingOrder);
    }

    // DELETE - Delete Order
    public void deleteOrder(Long id) {
        orderRepo.deleteById(id);
    }
}