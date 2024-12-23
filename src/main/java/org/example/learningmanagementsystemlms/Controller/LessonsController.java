package org.example.learningmanagementsystemlms.Controller;

import org.example.learningmanagementsystemlms.Service.LessonsService;
import org.example.learningmanagementsystemlms.dto.LessonDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/lessons")
public class LessonsController {

    @Autowired
    private LessonsService lessonsService;

    @PostMapping
    public ResponseEntity<LessonDto> addLesson(@RequestBody LessonDto dto) {
        LessonDto response = lessonsService.addLesson(dto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<LessonDto>> getLessonsByCourseId(@PathVariable Long courseId) {
        List<LessonDto> lessons = lessonsService.getLessonsByCourseId(courseId);
        return ResponseEntity.ok(lessons);
    }
}
