package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.Model.Assignment;
import org.example.learningmanagementsystemlms.Model.AssignmentSubmission;
import org.example.learningmanagementsystemlms.Repository.AssignmentRepository;
import org.example.learningmanagementsystemlms.Repository.AssignmentSubmissionRepository;
import org.example.learningmanagementsystemlms.dto.AssignmentDto;
import org.example.learningmanagementsystemlms.dto.AssignmentSubmissionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssignmentService implements IAssignmentService{

private final List<Assignment> assignments = new ArrayList<>();
    private Long assignmentIdCounter = 1L;

    @Override
    public AssignmentDto createAssignment(AssignmentDto dto) {
        Assignment assignment = new Assignment(assignmentIdCounter++, dto.getTitle(), dto.getDescription(), dto.getCourseId(), dto.getDueDate());
        assignments.add(assignment);
        return new AssignmentDto(assignment.getId(), assignment.getTitle(), assignment.getDescription(), assignment.getCourseId(), assignment.getDueDate());
    }

    @Override
    public List<AssignmentDto> getAssignmentsByCourseId(Long courseId) {
        return assignments.stream()
                .filter(assignment -> assignment.getCourseId().equals(courseId))
                .map(assignment -> new AssignmentDto(assignment.getId(), assignment.getTitle(), assignment.getDescription(), assignment.getCourseId(), assignment.getDueDate()))
                .collect(Collectors.toList());
    }

}
