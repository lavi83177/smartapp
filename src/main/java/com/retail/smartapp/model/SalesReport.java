package com.retail.smartapp.model;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "sales_report")
public class SalesReport {
	@Id
	private long reportId;
	private String reportType;
	private double totalSales;
	private int totalOrders;
	private LocalDateTime generateDate;
}
