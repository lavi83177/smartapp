package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Notification;
import com.retail.smartapp.model.Order;
import com.retail.smartapp.repo.NotificationRepo;
import com.retail.smartapp.repo.OrderRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificationService {
	@Autowired
	private NotificationRepo notificationRepo;
	public List<Notification> getAllNotification(){
		return notificationRepo.findAll();
	}
	public Optional<Notification> getNotificationById(Long id){
		return notificationRepo.findById(id);
	}
	public Notification CreateNotification(Notification notification) {
		return notificationRepo.save(notification);
	}
	public void deleteNotification(Long id) {
		notificationRepo.deleteById(id);
	}

}