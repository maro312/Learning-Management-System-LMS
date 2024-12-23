package org.example.learningmanagementsystemlms.Repository;

import org.example.learningmanagementsystemlms.Model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollmentRepository  {
    List<Enrollment> findByCourseId(Long courseId);

    // Find all enrollments for a specific student
    List<Enrollment> findByStudentId(Long studentId);

    // Check if a student is enrolled in a specific course
    boolean existsByStudentIdAndCourseId(Long studentId, Long courseId);
}
