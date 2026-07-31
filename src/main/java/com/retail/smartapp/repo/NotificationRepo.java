package com.retail.smartapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.smartapp.model.Notification;

@Repository
public interface NotificationRepo extends JpaRepository<Notification,Long> {

}
