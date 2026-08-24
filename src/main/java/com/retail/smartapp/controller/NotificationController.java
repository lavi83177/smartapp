package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.Notification;
import com.retail.smartapp.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    // GET - Get All Notifications
    @GetMapping
    public List<Notification> getAllNotification() {
        return notificationService.getAllNotification();
    }

    // GET - Get Notification By ID
    @GetMapping("/{id}")
    public Optional<Notification> getNotificationById(
            @PathVariable Long id) {

        return notificationService.getNotificationById(id);
    }

    // POST - Create Notification
    @PostMapping
    public Notification saveNotification(
            @RequestBody Notification notification) {

        return notificationService.CreateNotification(notification);
    }

    // PUT - Update Notification
    @PutMapping("/{id}")
    public Notification updateNotification(
            @PathVariable Long id,
            @RequestBody Notification notification) {

        return notificationService.updateNotification(id, notification);
    }

    // DELETE - Delete Notification
    @DeleteMapping("/{id}")
    public String deleteNotification(@PathVariable Long id) {

        notificationService.deleteNotification(id);

        return "Notification Deleted Successfully";
    }
}