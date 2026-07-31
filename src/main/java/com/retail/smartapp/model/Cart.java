package com.retail.smartapp.model;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="cart")
public class Cart {
	@Id
	private long cartId;
	private double totalAmount;
	private LocalDateTime createdAt;
}