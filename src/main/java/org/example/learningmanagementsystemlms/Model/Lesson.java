package org.example.learningmanagementsystemlms.Model;

import jakarta.persistence.*;


public class Lesson {


    private Long id;
    private String title;
    private String content; // This can be text or a file reference
    private Long courseId;

    // Constructors
    public Lesson() {}

    public Lesson(Long id, String title, String content, Long courseId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.courseId = courseId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}