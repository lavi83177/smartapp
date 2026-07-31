package com.retail.smartapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="product")
public class Product {
	@Id
	private long productId;
	private String productName;
	private String description;
	private double price;
	private int stockQuantity;
	private String imageUrl;
	private String status;
	
}
