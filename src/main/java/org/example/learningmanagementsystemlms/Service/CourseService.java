package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.Model.Course;
import org.example.learningmanagementsystemlms.Model.User;
import org.example.learningmanagementsystemlms.dto.CourseCreationDto;
import org.example.learningmanagementsystemlms.dto.CourseResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.learningmanagementsystemlms.Repository.CourseRepository;
import org.example.learningmanagementsystemlms.Repository.UserRepository;
import org.example.learningmanagementsystemlms.Service.ICourseService;


import java.util.ArrayList;
import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService implements ICourseService {

    private final List<Course> courses = new ArrayList<>();
    private Long courseIdCounter = 1L;

    @Override
    public CourseResponseDto createCourse(CourseCreationDto dto) {
        Course course = new Course(courseIdCounter++, dto.getTitle(), dto.getDescription(), dto.getDuration(), dto.getInstructorId());
        courses.add(course);
        return new CourseResponseDto(course.getId(), course.getTitle(), course.getDescription(), course.getDuration(), "Instructor Name Placeholder");
    }

    @Override
    public List<CourseResponseDto> getAllCourses() {
        return courses.stream()
                .map(course -> new CourseResponseDto(course.getId(), course.getTitle(), course.getDescription(), course.getDuration(), "Instructor Name Placeholder"))
                .collect(Collectors.toList());
    }

    @Override
    public List<CourseResponseDto> getCoursesByInstructor(Long instructorId) {
        return courses.stream()
                .filter(course -> course.getInstructorId().equals(instructorId))
                .map(course -> new CourseResponseDto(course.getId(), course.getTitle(), course.getDescription(), course.getDuration(), "Instructor Name Placeholder"))
                .collect(Collectors.toList());
    }
}
