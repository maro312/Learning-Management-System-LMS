package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.dto.NotificationDto;

import java.util.List;

public interface INotificationService {
    void sendNotification(NotificationDto notificationDto);
    List<NotificationDto> getNotificationsByUserId(Long userId);

}
