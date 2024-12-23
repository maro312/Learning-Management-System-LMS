package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.Model.Question;
import org.example.learningmanagementsystemlms.Model.Quiz;
import org.example.learningmanagementsystemlms.dto.QuizDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService implements IQuizService {
//    @Autowired
private final List<Quiz> quizzes = new ArrayList<>();
    private Long quizIdCounter = 1L;
    private Long questionIdCounter = 1L;

    @Override
    public QuizDto createQuiz(QuizDto dto) {
        List<Question> questions = dto.getQuestions().stream()
                .map(q -> new Question(questionIdCounter++, q.getQuestionText(), q.getQuestionType(), q.getCorrectAnswer()))
                .collect(Collectors.toList());

        Quiz quiz = new Quiz(quizIdCounter++, dto.getTitle(), dto.getCourseId(), questions);
        quizzes.add(quiz);

        return new QuizDto(quiz.getId(), quiz.getTitle(), quiz.getCourseId(), dto.getQuestions());
    }

    @Override
    public List<QuizDto> getQuizzesByCourseId(Long courseId) {
        return quizzes.stream()
                .filter(quiz -> quiz.getCourseId().equals(courseId))
                .map(quiz -> new QuizDto(quiz.getId(), quiz.getTitle(), quiz.getCourseId(), quiz.getQuestions()))
                .collect(Collectors.toList());
    }

}
