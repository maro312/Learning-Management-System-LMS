package org.example.learningmanagementsystemlms.Repository;

import org.example.learningmanagementsystemlms.Model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {

}
