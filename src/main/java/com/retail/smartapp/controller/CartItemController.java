package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.smartapp.model.CartItem;
import com.retail.smartapp.service.CartItemService;

@RestController
@RequestMapping("/cart-items")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @GetMapping
    public List<CartItem> getAllCartItem() {
        return cartItemService.getAllCartItem();
    }

    @GetMapping("/{id}")
    public Optional<CartItem> getCartItemById(@PathVariable Long id) {
        return cartItemService.getCartItemById(id);
    }

    @PostMapping
    public CartItem saveCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.CreateCartItem(cartItem);
    }

    @DeleteMapping("/{id}")
    public String deleteCartItem(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
        return "Cart Item Deleted Successfully";
    }
}