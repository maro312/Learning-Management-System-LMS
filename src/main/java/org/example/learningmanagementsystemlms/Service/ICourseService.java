package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.dto.CourseCreationDto;
import org.example.learningmanagementsystemlms.dto.CourseResponseDto;

import java.util.List;

public interface ICourseService {
    CourseResponseDto createCourse(CourseCreationDto courseCreationDto);
    List<CourseResponseDto> getAllCourses();
    List<CourseResponseDto> getCoursesByInstructor(Long instructorId);
}
