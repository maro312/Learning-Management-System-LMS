package org.example.learningmanagementsystemlms.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


public class Course {

    private Long id;
    private String title;
    private String description;
    private int duration; // Duration in days
    private Long instructorId;

    // Constructors
    public Course() {}

    public Course(Long id, String title, String description, int duration, Long instructorId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.instructorId = instructorId;
    }

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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }
}


