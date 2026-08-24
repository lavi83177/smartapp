package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.OrderItem;
import com.retail.smartapp.service.OrderItemService;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    // GET - Get All Order Items
    @GetMapping
    public List<OrderItem> getAllOrderItem() {
        return orderItemService.getAllOrderItem();
    }

    // GET - Get Order Item By ID
    @GetMapping("/{id}")
    public Optional<OrderItem> getOrderItemById(@PathVariable Long id) {
        return orderItemService.getOrderItemById(id);
    }

    // POST - Create Order Item
    @PostMapping
    public OrderItem saveOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.CreateOrderItem(orderItem);
    }

    // PUT - Update Order Item
    @PutMapping("/{id}")
    public OrderItem updateOrderItem(
            @PathVariable Long id,
            @RequestBody OrderItem orderItem) {

        return orderItemService.updateOrderItem(id, orderItem);
    }

    // DELETE - Delete Order Item
    @DeleteMapping("/{id}")
    public String deleteOrderItem(@PathVariable Long id) {
        orderItemService.deleteOrderItem(id);
        return "Order Item Deleted Successfully";
    }
}