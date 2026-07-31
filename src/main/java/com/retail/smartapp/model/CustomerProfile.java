package com.retail.smartapp.model;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "customer_profile")
public class CustomerProfile {
	@Id
	private long profileId;
	private double totalPurchase;
	private int totalOrders;
	private String customerSegment;
	private double lifetimeValue;
	private LocalDateTime lastPurchaseDate;
}
