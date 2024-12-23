package org.example.learningmanagementsystemlms.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


public class AssignmentSubmission {

    private Long id;


    private Assignment assignment;


    private User student;

    private String filePath; // Path to the submitted file

    private String feedback; // Instructor's feedback

    private Double grade; // Grade assigned to the submission

    private LocalDateTime submittedAt = LocalDateTime.now();

    // Default Constructor
    public AssignmentSubmission() {
    }

    // Parameterized Constructor
    public AssignmentSubmission(Assignment assignment, User student, String filePath) {
        this.assignment = assignment;
        this.student = student;
        this.filePath = filePath;
    }

    public AssignmentSubmission(Assignment assignment, User student, String filePath, String feedback, Double grade) {
        this.assignment = assignment;
        this.student = student;
        this.filePath = filePath;
        this.feedback = feedback;
        this.grade = grade;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public Long getAssignmentId() {
        return assignment.getId();
    }

    public Long getStudentId() {
        return student.getId();
    }
}
