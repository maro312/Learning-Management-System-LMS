package org.example.learningmanagementsystemlms.Repository;

import org.example.learningmanagementsystemlms.Model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository {

    List<Notification> findByUserId(Long userId);
}
