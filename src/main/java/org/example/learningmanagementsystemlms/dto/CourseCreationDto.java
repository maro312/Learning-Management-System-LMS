package org.example.learningmanagementsystemlms.dto;

public class CourseCreationDto {
    private String title;
    private String description;
    private int duration; // Duration in days
    private Long instructorId; // ID of the instructor

    public CourseCreationDto() {
    }

    public CourseCreationDto(String title, String description, int duration, Long instructorId) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.instructorId = instructorId;
    }

    // Getters and Setters
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

    public Long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }
}