package org.example.learningmanagementsystemlms.dto;

import java.time.LocalDateTime;

public class EnrollmentDto {
    private Long id;
    private Long studentId;
    private Long courseId;
    private String status;
    private LocalDateTime enrolledAt;

    // Constructors
    public EnrollmentDto() {}

    public EnrollmentDto(Long id, Long studentId, Long courseId, String status, LocalDateTime enrolledAt) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.status = status;
        this.enrolledAt = enrolledAt;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getEnrolledAt() {
        return enrolledAt;
    }

    public void setEnrolledAt(LocalDateTime enrolledAt) {
        this.enrolledAt = enrolledAt;
    }
}