package org.example.learningmanagementsystemlms.Controller;

import org.example.learningmanagementsystemlms.Service.AssignmentService;
import org.example.learningmanagementsystemlms.dto.AssignmentDto;
import org.example.learningmanagementsystemlms.dto.AssignmentSubmissionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping
    public ResponseEntity<AssignmentDto> createAssignment(@RequestBody AssignmentDto dto) {
        AssignmentDto response = assignmentService.createAssignment(dto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<AssignmentDto>> getAssignmentsByCourseId(@PathVariable Long courseId) {
        List<AssignmentDto> assignments = assignmentService.getAssignmentsByCourseId(courseId);
        return ResponseEntity.ok(assignments);
    }
}