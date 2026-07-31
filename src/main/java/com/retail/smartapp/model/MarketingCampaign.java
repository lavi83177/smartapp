package com.retail.smartapp.model;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "marketing_campaign")
public class MarketingCampaign {
	@Id
	private long campaignId;
	private String campaignName;
	private String description;
	private double discountPercentage;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private String targetSegment;
	private String status;
}
