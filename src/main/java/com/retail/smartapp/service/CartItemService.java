package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.CartItem;
import com.retail.smartapp.model.Category;
import com.retail.smartapp.repo.CartItemRepo;
import com.retail.smartapp.repo.CategoryRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartItemService {
	@Autowired
	private CartItemRepo cartItemRepo;
	public List<CartItem> getAllCartItem(){
		return cartItemRepo.findAll();
	}
	public Optional<CartItem> getCartItemById(Long id){
		return cartItemRepo.findById(id);
	}
	public CartItem CreateCartItem(CartItem cartItem) {
		return cartItemRepo.save(cartItem);
	}
	public void deleteCartItem(Long id) {
		cartItemRepo.deleteById(id);
	}
	public CartItem updateCartItem(Long id, CartItem cartItem) {

	    CartItem existingCartItem = cartItemRepo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Cart Item not found with id: " + id));

	    existingCartItem.setQuantity(cartItem.getQuantity());
	    existingCartItem.setSubtotal(cartItem.getSubtotal());

	    return cartItemRepo.save(existingCartItem);
	}
}