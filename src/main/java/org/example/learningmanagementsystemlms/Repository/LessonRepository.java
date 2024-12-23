package org.example.learningmanagementsystemlms.Repository;

import org.example.learningmanagementsystemlms.Model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository {

    List<Lesson> findByCourseId(Long courseId);
}
