package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Cart;
import com.retail.smartapp.model.CartItem;
import com.retail.smartapp.repo.CartItemRepo;
import com.retail.smartapp.repo.CartRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartService {
	@Autowired
	private CartRepo cartRepo;
	public List<Cart> getAllCart(){
		return cartRepo.findAll();
	}
	public Optional<Cart> getCartById(Long id){
		return cartRepo.findById(id);
	}
	public Cart CreateCart(Cart cart) {
		return cartRepo.save(cart);
	}
	public void deleteCart(Long id) {
		cartRepo.deleteById(id);
	}
}