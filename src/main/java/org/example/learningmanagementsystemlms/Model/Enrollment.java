package org.example.learningmanagementsystemlms.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "enrollments", uniqueConstraints = @UniqueConstraint(columnNames = {"student_id", "crs_id"}))
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private User student;

    @ManyToOne
    @JoinColumn(name = "crs_id", nullable = false)
    private Course course;

    @Column(nullable = false)
    private String status = "Enrolled"; // Enrolled, Completed, etc.

    @Column(nullable = false)
    private LocalDateTime enrolledAt = LocalDateTime.now();

    // Getters and Setters
}
