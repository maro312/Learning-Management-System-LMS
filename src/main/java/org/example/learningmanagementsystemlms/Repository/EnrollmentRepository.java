package org.example.learningmanagementsystemlms.Repository;

import org.example.learningmanagementsystemlms.Model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

}
