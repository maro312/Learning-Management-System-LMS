package org.example.learningmanagementsystemlms.Repository;

import org.example.learningmanagementsystemlms.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
