package org.example.learningmanagementsystemlms.Repository;

import org.example.learningmanagementsystemlms.Model.AssignmentSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentSubmissionRepository  {
    // Find all submissions for a specific assignment
    List<AssignmentSubmission> findByAssignmentId(Long assignmentId);

    // Find all submissions by a specific student
    List<AssignmentSubmission> findByStudentId(Long studentId);

    // Find all submissions for a specific student and assignment
    List<AssignmentSubmission> findByAssignmentIdAndStudentId(Long assignmentId, Long studentId);
}

