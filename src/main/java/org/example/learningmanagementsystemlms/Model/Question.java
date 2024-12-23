package org.example.learningmanagementsystemlms.Model;

import jakarta.persistence.*;


public class Question {


    private Long id;
    private String questionText;
    private String questionType; // MCQ, True/False, Short Answer
    private String correctAnswer;

    // Constructors
    public Question() {}

    public Question(Long id, String questionText, String questionType, String correctAnswer) {
        this.id = id;
        this.questionText = questionText;
        this.questionType = questionType;
        this.correctAnswer = correctAnswer;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
