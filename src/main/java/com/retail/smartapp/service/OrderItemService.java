package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.OrderItem;
import com.retail.smartapp.model.Payment;
import com.retail.smartapp.repo.OrderItemRepo;
import com.retail.smartapp.repo.PaymentRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderItemService {
	@Autowired
	private OrderItemRepo orderItemRepo;
	public List<OrderItem> getAllOrderItem(){
		return orderItemRepo.findAll();
	}
	public Optional<OrderItem> getOrderItemById(Long id){
		return orderItemRepo.findById(id);
	}
	public OrderItem CreateOrderItem(OrderItem orderItem) {
		return orderItemRepo.save(orderItem);
	}
	public void deleteOrderItem(Long id) {
		orderItemRepo.deleteById(id);
	}
}
