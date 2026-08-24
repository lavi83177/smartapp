package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.Cart;
import com.retail.smartapp.service.CartService;

@RestController
@RequestMapping("/api/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    // GET - Get All Carts
    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.getAllCart();
    }

    // GET - Get Cart By ID
    @GetMapping("/{id}")
    public Optional<Cart> getCartById(@PathVariable Long id) {
        return cartService.getCartById(id);
    }

    // POST - Create Cart
    @PostMapping
    public Cart saveCart(@RequestBody Cart cart) {
        return cartService.CreateCart(cart);
    }

    // PUT - Update Cart
    @PutMapping("/{id}")
    public Cart updateCart(
            @PathVariable Long id,
            @RequestBody Cart cart) {

        return cartService.updateCart(id, cart);
    }

    // DELETE - Delete Cart
    @DeleteMapping("/{id}")
    public String deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
        return "Cart Deleted Successfully";
    }
}