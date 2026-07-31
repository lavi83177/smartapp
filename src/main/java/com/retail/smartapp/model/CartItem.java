package com.retail.smartapp.model;

	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.Data;

	@Entity
	@Data
	@Table(name ="cart_item")
	public class CartItem {
		@Id
		private long cartItemId;
		private int quantity;
		private double subtotal;
	
}
