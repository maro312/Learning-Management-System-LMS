package org.example.learningmanagementsystemlms.Repository;

import org.example.learningmanagementsystemlms.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository {
    List<Course> findByInstructorId(Long instructorId);

}
