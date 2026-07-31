package com.retail.smartapp.model;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "inventory")
public class Inventory {
	@Id
	private long inventoryId;
	private int availableStock;
	private int reorderLevel;
	private LocalDateTime lastUpdated;
}
