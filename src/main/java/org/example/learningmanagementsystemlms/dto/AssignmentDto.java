package org.example.learningmanagementsystemlms.dto;

import java.time.LocalDateTime;

public class AssignmentDto {
    private Long id;
    private String title;
    private String description;
    private Long courseId;
    private LocalDateTime dueDate; // ISO-8601 format (e.g., "2024-01-01T23:59:59")

    public AssignmentDto() {
    }

    public AssignmentDto(Long id, String title, String description, Long courseId, String dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.courseId = courseId;
        this.dueDate = LocalDateTime.parse(dueDate);
    }



//    public AssignmentDto(Long id, String title, String description, Long courseId, LocalDateTime dueDate) {
//        this.id = id,
//        this.title = title,
//        this.description = description,
//        this.courseId = courseId,
//        this.dueDate = dueDate
//    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
