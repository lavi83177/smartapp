package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.Notification;
import com.retail.smartapp.repo.NotificationRepo;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepo notificationRepo;

    // GET - Get All Notifications
    public List<Notification> getAllNotification() {
        return notificationRepo.findAll();
    }

    // GET - Get Notification By ID
    public Optional<Notification> getNotificationById(Long id) {
        return notificationRepo.findById(id);
    }

    // POST - Create Notification
    public Notification CreateNotification(Notification notification) {
        return notificationRepo.save(notification);
    }

    // PUT - Update Notification
    public Notification updateNotification(
            Long id,
            Notification notification) {

        Notification existingNotification =
                notificationRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Notification not found with id: " + id));

        // Update Notification fields here
        // Example:
        // existingNotification.setMessage(notification.getMessage());
        // existingNotification.setStatus(notification.getStatus());

        return notificationRepo.save(existingNotification);
    }

    // DELETE - Delete Notification
    public void deleteNotification(Long id) {
        notificationRepo.deleteById(id);
    }
}