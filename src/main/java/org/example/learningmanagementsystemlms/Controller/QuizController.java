package org.example.learningmanagementsystemlms.Controller;

import org.example.learningmanagementsystemlms.Service.QuizService;
import org.example.learningmanagementsystemlms.Service.UserService;
import org.example.learningmanagementsystemlms.dto.QuizDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    @Autowired
    private QuizService quizService;
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<QuizDto> createQuiz(@RequestBody QuizDto dto) {
        if (userService.check_user_authentication()) {
            QuizDto response = quizService.createQuiz(dto);
            return ResponseEntity.ok(response);
        }
        else
            return ResponseEntity.status(403).body(new QuizDto());
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<QuizDto>> getQuizzesByCourseId(@PathVariable Long courseId) {
        List<QuizDto> quizzes = quizService.getQuizzesByCourseId(courseId);
        return ResponseEntity.ok(quizzes);
    }
}