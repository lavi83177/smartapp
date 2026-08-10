package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.Cart;
import com.retail.smartapp.service.CartService;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.getAllCart();
    }

    @GetMapping("/{id}")
    public Optional<Cart> getCartById(@PathVariable Long id) {
        return cartService.getCartById(id);
    }

    @PostMapping
    public Cart saveCart(@RequestBody Cart cart) {
        return cartService.CreateCart(cart);
    }

    @DeleteMapping("/{id}")
    public String deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
        return "Cart Deleted Successfully";
    }
}