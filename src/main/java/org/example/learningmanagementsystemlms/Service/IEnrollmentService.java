package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.dto.EnrollmentDto;

import java.util.List;

public interface IEnrollmentService {
    String enrollStudent(EnrollmentDto enrollmentDto);
    List<EnrollmentDto> getEnrollmentsByCourseId(Long courseId);
    List<EnrollmentDto> getEnrollmentsByStudentId(Long studentId);
}
