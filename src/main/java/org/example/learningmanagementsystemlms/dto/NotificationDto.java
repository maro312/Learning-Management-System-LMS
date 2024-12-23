package org.example.learningmanagementsystemlms.dto;

public class NotificationDto {
    private Long id;
    private Long userId;
    private String message;
    private boolean isRead;

    public NotificationDto() {
    }

    public NotificationDto(Long id, Long userId, String message, boolean isRead) {
        this.id = id;
        this.userId = userId;
        this.message = message;
        this.isRead = isRead;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}