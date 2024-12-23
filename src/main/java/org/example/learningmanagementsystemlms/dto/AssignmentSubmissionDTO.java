package org.example.learningmanagementsystemlms.dto;

import org.example.learningmanagementsystemlms.Model.AssignmentSubmission;

import java.time.LocalDateTime;

public class AssignmentSubmissionDTO {

    private Long id;
    private Long assignmentId;
    private Long studentId;
    private String filePath;
    private String feedback;
    private Double grade;
    private LocalDateTime submittedAt;

    // Default Constructor
    public AssignmentSubmissionDTO() {
    }

    // Parameterized Constructor
    public AssignmentSubmissionDTO(Long id, Long assignmentId, Long studentId, String filePath, String feedback, Double grade, LocalDateTime submittedAt) {
        this.id = id;
        this.assignmentId = assignmentId;
        this.studentId = studentId;
        this.filePath = filePath;
        this.feedback = feedback;
        this.grade = grade;
        this.submittedAt = submittedAt;
    }

    public AssignmentSubmissionDTO(Long id, Long assignmentId, Long studentId, String filePath, String feedback, Double grade) {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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

    // Helper method to convert AssignmentSubmission to AssignmentSubmissionDTO
    public static AssignmentSubmissionDTO fromEntity(AssignmentSubmission assignmentSubmission) {
        return new AssignmentSubmissionDTO(
                assignmentSubmission.getId(),
                assignmentSubmission.getAssignment().getId(),
                assignmentSubmission.getStudent().getId(),
                assignmentSubmission.getFilePath(),
                assignmentSubmission.getFeedback(),
                assignmentSubmission.getGrade(),
                assignmentSubmission.getSubmittedAt()
        );
    }
}
