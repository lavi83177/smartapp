package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.OrderItem;
import com.retail.smartapp.repo.OrderItemRepo;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepo orderItemRepo;

    // GET - Get All Order Items
    public List<OrderItem> getAllOrderItem() {
        return orderItemRepo.findAll();
    }

    // GET - Get Order Item By ID
    public Optional<OrderItem> getOrderItemById(Long id) {
        return orderItemRepo.findById(id);
    }

    // POST - Create Order Item
    public OrderItem CreateOrderItem(OrderItem orderItem) {
        return orderItemRepo.save(orderItem);
    }

    // PUT - Update Order Item
    public OrderItem updateOrderItem(Long id, OrderItem orderItem) {

        OrderItem existingOrderItem = orderItemRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Order Item not found with id: " + id));

        existingOrderItem.setQuantity(orderItem.getQuantity());
        existingOrderItem.setPrice(orderItem.getPrice());
        existingOrderItem.setSubtotal(orderItem.getSubtotal());

        return orderItemRepo.save(existingOrderItem);
    }
    // DELETE - Delete Order Item
    public void deleteOrderItem(Long id) {
        orderItemRepo.deleteById(id);
    }
}