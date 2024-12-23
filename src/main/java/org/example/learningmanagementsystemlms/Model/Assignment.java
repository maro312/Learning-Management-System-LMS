package org.example.learningmanagementsystemlms.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


public class Assignment {

    private Long id;
    private String title;
    private String description;
    private Long courseId;
    private String dueDate; // ISO-8601 format

    // Constructors
    public Assignment() {}

    public Assignment(Long id, String title, String description, Long courseId, LocalDateTime dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.courseId = courseId;
        this.dueDate = String.valueOf(dueDate);
    }

//    public Assignment(Long id, String title, String description, Long courseId, LocalDateTime dueDate) {
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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}