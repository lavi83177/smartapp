package com.retail.smartapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="category")
public class Category {
	@Id
	private long categoryId;
	private String categoryName;
	private String description;
}
