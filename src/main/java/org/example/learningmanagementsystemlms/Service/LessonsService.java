package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.Model.Lesson;
import org.example.learningmanagementsystemlms.Model.User;
import org.example.learningmanagementsystemlms.Repository.LessonRepository;
import org.example.learningmanagementsystemlms.Repository.UserRepository;
import org.example.learningmanagementsystemlms.dto.LessonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LessonsService implements ILessonsService{
    private final List<Lesson> lessons = new ArrayList<>();
    private Long lessonIdCounter = 1L;

    @Override
    public LessonDto addLesson(LessonDto dto) {
        Lesson lesson = new Lesson(lessonIdCounter++, dto.getTitle(), dto.getContent(), dto.getCourseId());
        lessons.add(lesson);
        return new LessonDto(lesson.getId(), lesson.getTitle(), lesson.getContent(), lesson.getCourseId());
    }

    @Override
    public List<LessonDto> getLessonsByCourseId(Long courseId) {
        return lessons.stream()
                .filter(lesson -> lesson.getCourseId().equals(courseId))
                .map(lesson -> new LessonDto(lesson.getId(), lesson.getTitle(), lesson.getContent(), lesson.getCourseId()))
                .collect(Collectors.toList());
    }


}
