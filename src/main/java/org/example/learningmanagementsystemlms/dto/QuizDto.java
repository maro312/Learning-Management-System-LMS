package org.example.learningmanagementsystemlms.dto;

import org.example.learningmanagementsystemlms.Model.Question;

import java.util.List;

public class QuizDto {
    private Long id;
    private String title;
    private Long courseId;
    private List<Question> questions;

    public QuizDto() {
    }

    public QuizDto(Long id, String title, Long courseId, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.courseId = courseId;
        this.questions = questions;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
