package com.first.FoodApp.email_notification.services;

import com.first.FoodApp.email_notification.dtos.NotificationDTO;
import com.first.FoodApp.email_notification.entity.Notification;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO);


}
