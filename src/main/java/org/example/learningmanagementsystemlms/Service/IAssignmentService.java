package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.dto.AssignmentDto;
import org.example.learningmanagementsystemlms.dto.AssignmentSubmissionDTO;

import java.util.List;

public interface IAssignmentService {
    AssignmentDto createAssignment(AssignmentDto assignmentDto);
    List<AssignmentDto> getAssignmentsByCourseId(Long courseId);
}
