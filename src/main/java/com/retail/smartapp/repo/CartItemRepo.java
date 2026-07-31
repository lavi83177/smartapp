package com.retail.smartapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.smartapp.model.CartItem;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Long> {

}
