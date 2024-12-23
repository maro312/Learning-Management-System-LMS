package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.Model.Notification;
import org.example.learningmanagementsystemlms.Repository.NotificationRepository;
import org.example.learningmanagementsystemlms.dto.NotificationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificationService implements INotificationService {
//    @Autowired
private final List<Notification> notifications = new ArrayList<>();
    private Long notificationIdCounter = 1L;

    @Override
    public void sendNotification(NotificationDto dto) {
        Notification notification = new Notification(notificationIdCounter++, dto.getUserId(), dto.getMessage(), false, LocalDateTime.now());
        notifications.add(notification);
    }

    @Override
    public List<NotificationDto> getNotificationsByUserId(Long userId) {
        return notifications.stream()
                .filter(notification -> notification.getUserId().equals(userId))
                .map(notification -> new NotificationDto(notification.getId(), notification.getUserId(), notification.getMessage(), notification.isRead()))
                .collect(Collectors.toList());
    }

}
