package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.smartapp.model.CartItem;
import com.retail.smartapp.service.CartItemService;

@RestController
@RequestMapping("/api/cart-items")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    // GET - Get All Cart Items
    @GetMapping
    public List<CartItem> getAllCartItem() {
        return cartItemService.getAllCartItem();
    }

    // GET - Get Cart Item By ID
    @GetMapping("/{id}")
    public Optional<CartItem> getCartItemById(@PathVariable Long id) {
        return cartItemService.getCartItemById(id);
    }

    // POST - Create Cart Item
    @PostMapping
    public CartItem saveCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.CreateCartItem(cartItem);
    }

    // PUT - Update Cart Item
    @PutMapping("/{id}")
    public CartItem updateCartItem(
            @PathVariable Long id,
            @RequestBody CartItem cartItem) {

        return cartItemService.updateCartItem(id, cartItem);
    }

    // DELETE - Delete Cart Item
    @DeleteMapping("/{id}")
    public String deleteCartItem(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
        return "Cart Item Deleted Successfully";
    }
}