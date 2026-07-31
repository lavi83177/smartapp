package com.retail.smartapp.model;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name ="notification")
public class Notification {
	@Id
	private long notificationId;
	private String title;
	private String message;
	private String type;
	private Boolean isRead;
	private LocalDateTime createdAt;
}