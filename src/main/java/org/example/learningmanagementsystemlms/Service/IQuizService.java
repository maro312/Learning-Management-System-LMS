package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.dto.QuizDto;

import java.util.List;

public interface IQuizService {
    QuizDto createQuiz(QuizDto quizDto);
    List<QuizDto> getQuizzesByCourseId(Long courseId);
}
