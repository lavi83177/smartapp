package com.retail.smartapp.model;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {
	@Id
	private long orderId;
	private  double totalPurchase;
	private String orderStatus;
	private String paymentStatus;
	private String shippingAddress;
	private LocalDateTime orderDate;
}
