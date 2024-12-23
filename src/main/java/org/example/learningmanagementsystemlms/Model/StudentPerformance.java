package org.example.learningmanagementsystemlms.Model;

public class StudentPerformance {
    private Long studentId;
    private String studentName;
    private Double grade;
    private Double attendance;

    public StudentPerformance(Long studentId, String studentName, Double grade, Double attendance) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.attendance = attendance;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Double getGrade() {
        return grade;
    }

    public Double getAttendance() {
        return attendance;
    }
}
