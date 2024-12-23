package org.example.learningmanagementsystemlms.dto;

public class CourseResponseDto {
    private Long id;
    private String title;
    private String description;
    private int duration;
    private String instructorName;

    public CourseResponseDto() {
    }

    public CourseResponseDto(Long id, String title, String description, int duration, String instructorName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.instructorName = instructorName;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
