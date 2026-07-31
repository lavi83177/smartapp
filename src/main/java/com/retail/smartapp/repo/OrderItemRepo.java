package com.retail.smartapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.smartapp.model.OrderItem;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem,Long>{

}
