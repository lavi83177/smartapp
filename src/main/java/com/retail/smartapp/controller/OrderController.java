package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.Order;
import com.retail.smartapp.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // GET - Get All Orders
    @GetMapping
    public List<Order> getAllOrder() {
        return orderService.getAllOrder();
    }

    // GET - Get Order By ID
    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    // POST - Create Order
    @PostMapping
    public Order saveOrder(@RequestBody Order order) {
        return orderService.CreateOrder(order);
    }

    // PUT - Update Order
    @PutMapping("/{id}")
    public Order updateOrder(
            @PathVariable Long id,
            @RequestBody Order order) {

        return orderService.updateOrder(id, order);
    }

    // DELETE - Delete Order
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "Order Deleted Successfully";
    }
}