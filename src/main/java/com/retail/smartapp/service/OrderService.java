package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Order;
import com.retail.smartapp.model.OrderItem;
import com.retail.smartapp.repo.OrderItemRepo;
import com.retail.smartapp.repo.OrderRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	@Autowired
	private OrderRepo orderRepo;
	public List<Order> getAllOrder(){
		return orderRepo.findAll();
	}
	public Optional<Order> getOrderById(Long id){
		return orderRepo.findById(id);
	}
	public Order CreateOrder(Order order) {
		return orderRepo.save(order);
	}
	public void deleteOrder(Long id) {
		orderRepo.deleteById(id);
	}
}
