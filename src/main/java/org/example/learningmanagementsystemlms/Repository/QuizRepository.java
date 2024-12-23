package org.example.learningmanagementsystemlms.Repository;

import org.example.learningmanagementsystemlms.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository  {

    List<Quiz> findByCourseId(Long courseId);
}
