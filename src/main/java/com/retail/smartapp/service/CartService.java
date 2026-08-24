package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Cart;
import com.retail.smartapp.repo.CartRepo;

@Service
public class CartService {

    @Autowired
    private CartRepo cartRepo;

    public List<Cart> getAllCart() {
        return cartRepo.findAll();
    }

    public Optional<Cart> getCartById(Long id) {
        return cartRepo.findById(id);
    }

    public Cart CreateCart(Cart cart) {
        return cartRepo.save(cart);
    }

    // PUT - Update Cart
    public Cart updateCart(Long id, Cart cart) {

        Cart existingCart = cartRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Cart not found with id: " + id));

        existingCart.setTotalAmount(cart.getTotalAmount());
        existingCart.setCreatedAt(cart.getCreatedAt());

        return cartRepo.save(existingCart);
    }

    public void deleteCart(Long id) {
        cartRepo.deleteById(id);
    }
}