package com.retail.smartapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "order_item")
public class OrderItem {
	@Id
	private long orderItemId;
	private int quantity;
	private double price;
	private double subtotal;
}