package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.Model.Course;
import org.example.learningmanagementsystemlms.Model.Enrollment;
import org.example.learningmanagementsystemlms.Model.User;
import org.example.learningmanagementsystemlms.Repository.CourseRepository;
import org.example.learningmanagementsystemlms.Repository.EnrollmentRepository;
import org.example.learningmanagementsystemlms.Repository.UserRepository;
import org.example.learningmanagementsystemlms.dto.EnrollmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnrollmentService implements IEnrollmentService{
//    @Autowired
private final List<Enrollment> enrollments = new ArrayList<>();
    private Long enrollmentIdCounter = 1L;

    @Override
    public String enrollStudent(EnrollmentDto dto) {
        // Check if the student is already enrolled in the course
        boolean alreadyEnrolled = enrollments.stream()
                .anyMatch(enrollment -> enrollment.getStudentId().equals(dto.getStudentId()) &&
                        enrollment.getCourseId().equals(dto.getCourseId()));

        if (alreadyEnrolled) {
            return "Student is already enrolled in the course.";
        }

        // Add new enrollment
        Enrollment enrollment = new Enrollment(
                enrollmentIdCounter++,
                dto.getStudentId(),
                dto.getCourseId(),
                "Enrolled",
                LocalDateTime.now()
        );
        enrollments.add(enrollment);

        return "Student successfully enrolled.";
    }

    @Override
    public List<EnrollmentDto> getEnrollmentsByCourseId(Long courseId) {
        return enrollments.stream()
                .filter(enrollment -> enrollment.getCourseId().equals(courseId))
                .map(enrollment -> new EnrollmentDto(enrollment.getId(), enrollment.getStudentId(),
                        enrollment.getCourseId(), enrollment.getStatus(), enrollment.getEnrolledAt()))
                .collect(Collectors.toList());
    }

    @Override
    public List<EnrollmentDto> getEnrollmentsByStudentId(Long studentId) {
        return enrollments.stream()
                .filter(enrollment -> enrollment.getStudentId().equals(studentId))
                .map(enrollment -> new EnrollmentDto(enrollment.getId(), enrollment.getStudentId(),
                        enrollment.getCourseId(), enrollment.getStatus(), enrollment.getEnrolledAt()))
                .collect(Collectors.toList());
    }
}
