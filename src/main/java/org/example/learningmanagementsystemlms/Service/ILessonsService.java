package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.dto.LessonDto;

import java.util.List;

public interface ILessonsService {
    LessonDto addLesson(LessonDto lessonDto);
    List<LessonDto> getLessonsByCourseId(Long courseId);
}
