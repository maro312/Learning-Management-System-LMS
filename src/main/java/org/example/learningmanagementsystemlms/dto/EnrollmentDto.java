package org.example.learningmanagementsystemlms.dto;

public class EnrollmentDto {
    private Long studentId;
    private Long courseId;

    public EnrollmentDto() {
    }

    public EnrollmentDto(Long studentId, Long courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    // Getters and Setters
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
}